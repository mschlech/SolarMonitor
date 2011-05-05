package com.entscheidungsbaum.android.solarMonitor.view;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

import net.droidsolutions.droidcharts.awt.Rectangle2D;
import net.droidsolutions.droidcharts.core.JFreeChart;
import net.droidsolutions.droidcharts.core.data.XYDataset;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Log;
import android.view.View;

import com.entscheidungsbaum.android.solarMonitor.SensorBean;

/**
 * @author mschlech
 * 
 *         TemperatureChart
 */

public class TemperatureChart extends View {

	private final Rect mRect = new Rect();

	private final Handler mHandler;

	public TemperatureChart(Context context) {
		super(context);
		mHandler = new Handler();
		/**
		 * for development purposes
		 */
		this.fillSensorBean();
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.getClipBounds(mRect);
		final XYDataset dataset = createDataset();
		final JFreeChart chart = createChart(dataset);
		chart.draw(canvas, new Rectangle2D.Double(0, 0, mRect.width(), mRect.height()));
		Paint p = new Paint();
		p.setColor(Color.RED);
	}

	/**
	 * 
	 * @return
	 */
	private XYDataset createDataset() {

		return null;
	}

	/**
	 * 
	 * @param dataset
	 * @return
	 */
	private JFreeChart createChart(final XYDataset dataset) {

		return null;
	}

	/**
	 * @TODO introduce some Parameters to fill in for a specific date
	 */
	private void fillSensorBean() {
		SensorBean sb = new SensorBean();
		String file = "/Users/mschlech/workspace/SolarMonitor/tmp/TextData_20110329.log.csv";
		try {

			BufferedReader br = new BufferedReader(new FileReader(file));

			String strLine = null;

			StringTokenizer st = null;

			int lineNumber = 0, tokenNumber = 0;

			while ((file = br.readLine()) != null)

			{

				lineNumber++;

				// break comma separated line using ","

				st = new StringTokenizer(file, "\t");

				while (st.hasMoreTokens())

				{

					// display csv values

					tokenNumber++;

					Log.d("Line  " + lineNumber +

					", Token  " + tokenNumber

					+ ", Token : " , st.nextToken());

				}

				// reset token number

				tokenNumber = 0;

			}

		}

		catch (FileNotFoundException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (IOException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}

}
