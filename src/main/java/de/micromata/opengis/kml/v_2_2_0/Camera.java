
package de.micromata.opengis.kml.v_2_2_0;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;


/**
 * <Camera>
 * <p>
 * Defines the virtual camera that views the scene. This element defines the position 
 * of the camera relative to the Earth's surface as well as the viewing direction of 
 * the camera. The camera position is defined by <longitude>, <latitude>, <altitude>, 
 * and either <altitudeMode> or <gx:altitudeMode>. The viewing direction of the camera 
 * is defined by <heading>, <tilt>, and <roll>. <Camera> can be a child element of 
 * any Feature or of <NetworkLinkControl>. A parent element cannot contain both a <Camera> 
 * and a <LookAt> at the same time. 
 * </p>
 * <p>
 * <Camera> provides full six-degrees-of-freedom control over the view, so you can 
 * position the Camera in space and then rotate it around the X, Y, and Z axes. Most 
 * importantly, you can tilt the camera view so that you're looking above the horizon 
 * into the sky. 
 * </p>
 * <p>
 * <Camera> can also contain a TimePrimitive (<gx:TimeSpan> or <gx:TimeStamp>). Time 
 * values in Camera affect historical imagery, sunlight, and the display of time-stamped 
 * features. For more information, read Time with AbstractViews in the Time and Animation 
 * chapter of the Developer's Guide. 
 * </p>
 * <p>
 * Defining a View 
 * </p>
 * <p>
 * Within a Feature or <NetworkLinkControl>, use either a <Camera> or a <LookAt> object 
 * (but not both in the same object). The <Camera> object defines the viewpoint in 
 * terms of the viewer's position and orientation. The <Camera> object allows you to 
 * specify a view that is not on the Earth's surface. The <LookAt> object defines the 
 * viewpoint in terms of what is being viewed. The <LookAt> object is more limited 
 * in scope than <Camera> and generally requires that the view direction intersect 
 * the Earth's surface. 
 * </p>
 * <p>
 * The following diagram shows the X, Y, and Z axes, which are attached to the virtual 
 * camera. 
 * </p>
 * <p>
 * The X axis points toward the right of the camera and is called the right vector. 
 * The Y axis defines the "up" direction relative to the screen and is called the up 
 * vector. The Z axis points from the center of the screen toward the eye point. The 
 * camera looks down the ?Z axis, which is called the view vector. 
 * </p>
 * 
 * Syntax: 
 * <pre><strong>&lt;Camera id="ID"&gt;</strong>
 *   &lt;!-- inherited from AbstractView element --&gt;
 *   <em>&lt;TimePrimitive&gt;...&lt;/TimePrimitive&gt;</em>  &lt;!-- gx:TimeSpan or gx:TimeStamp --&gt;
 *    
 *   &lt;!-- specific to Camera --&gt;
 *   &lt;longitude&gt;0&lt;/longitude&gt;            &lt;!-- kml:angle180 --&gt; 
 *   &lt;latitude&gt;0&lt;/latitude&gt;              &lt;!-- kml:angle90 --&gt;
 *   &lt;altitude&gt;0&lt;/altitude&gt;              &lt;!-- double --&gt;
 *   &lt;heading&gt;0&lt;/heading&gt;                &lt;!-- kml:angle360 --&gt;
 *   &lt;tilt&gt;0&lt;/tilt&gt;                      &lt;!-- kml:anglepos180 --&gt;
 *   &lt;roll&gt;0&lt;/roll&gt;                      &lt;!-- kml:angle180 --&gt;
 *   &lt;altitudeMode&gt;clampToGround&lt;/altitudeMode&gt;              
 *         &lt;!-- kml:altitudeModeEnum: relativeToGround, clampToGround, or absolute --&gt;
 *         &lt;!-- or, gx:altitudeMode can be substituted: clampToSeaFloor, relativeToSeaFloor --&gt;
 * <strong>&lt;/Camera&gt;</strong> </pre>
 * 
 * Extends: 
 * @see: <AbstractView>
 * 
 * Contained By: 
 * @see: <Feature>
 * @see: <NetworkLinkControl>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CameraType", propOrder = {
    "longitude",
    "latitude",
    "altitude",
    "heading",
    "tilt",
    "roll",
    "altitudeMode",
    "cameraSimpleExtension",
    "cameraObjectExtension"
})
@XmlRootElement(name = "Camera", namespace = "http://www.opengis.net/kml/2.2")
public class Camera
    extends AbstractView
{

    /**
     * <longitude>
     * <p>
     * Longitude of the virtual camera (eye point). Angular distance in degrees, relative 
     * to the Prime Meridian. Values west of the Meridian range from ?180 to 0 degrees. 
     * Values east of the Meridian range from 0 to 180 degrees. 
     * </p>
     * <p>
     * Longitude of the point the camera is looking at. Angular distance in degrees, relative 
     * to the Prime Meridian. Values west of the Meridian range from ?180 to 0 degrees. 
     * Values east of the Meridian range from 0 to 180 degrees. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double longitude = 0.0D;
    /**
     * <latitude>
     * <p>
     * Latitude of the virtual camera. Degrees north or south of the Equator (0 degrees). 
     * Values range from ?90 degrees to 90 degrees. 
     * </p>
     * <p>
     * Latitude of the point the camera is looking at. Degrees north or south of the Equator 
     * (0 degrees). Values range from ?90 degrees to 90 degrees. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double latitude = 0.0D;
    /**
     * <altitude>
     * <p>
     * Distance of the camera from the earth's surface, in meters. Interpreted according 
     * to the Camera's <altitudeMode> or <gx:altitudeMode>. 
     * </p>
     * <p>
     * Specifies the distance above the earth's surface, in meters, and is interpreted 
     * according to the altitude mode. 
     * </p>
     * <p>
     * Distance from the earth's surface, in meters. Interpreted according to the LookAt's 
     * altitude mode. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double altitude = 0.0D;
    /**
     * <heading>
     * <p>
     * Direction (azimuth) of the camera, in degrees. Default=0 (true North). (See diagram.) 
     * Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Direction (that is, North, South, East, West), in degrees. Default=0 (North). (See 
     * diagram.) Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Direction (that is, North, South, East, West), in degrees. Default=0 (North). (See 
     * diagram below.) Values range from 0 to 360 degrees. 
     * </p>
     * <p>
     * Rotation about the z axis (normal to the Earth's surface). A value of 0 (the default) 
     * equals North. A positive rotation is clockwise around the z axis and specified in 
     * degrees from 0 to 360. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double heading = 0.0D;
    /**
     * <tilt>
     * <p>
     * Rotation, in degrees, of the camera around the X axis. A value of 0 indicates that 
     * the view is aimed straight down toward the earth (the most common case). A value 
     * for 90 for <tilt> indicates that the view is aimed toward the horizon. Values greater 
     * than 90 indicate that the view is pointed up into the sky. Values for <tilt> are 
     * clamped at +180 degrees. 
     * </p>
     * <p>
     * Angle between the direction of the LookAt position and the normal to the surface 
     * of the earth. (See diagram below.) Values range from 0 to 90 degrees. Values for 
     * <tilt> cannot be negative. A <tilt> value of 0 degrees indicates viewing from directly 
     * above. A <tilt> value of 90 degrees indicates viewing along the horizon. 
     * </p>
     * <p>
     * Rotation about the x axis. A positive rotation is clockwise around the x axis and 
     * specified in degrees from 0 to 360. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double tilt = 0.0D;
    /**
     * <roll>
     * <p>
     * Rotation, in degrees, of the camera around the Z axis. Values range from ?180 to 
     * +180 degrees. 
     * </p>
     * <p>
     * Rotation about the y axis. A positive rotation is clockwise around the y axis and 
     * specified in degrees from 0 to 360. 
     * </p>
     * <p>
     * This diagram illustrates the typical orientation of a model's axes: 
     * </p>
     * <p>
     * <heading> Rotation about the z axis (normal to the Earth's surface). A value of 
     *  0 (the default) equals North. A positive rotation is clockwise around the z axis 
     * and specified in degrees from 0 to 360. <tilt> Rotation about the x axis. A positive 
     * rotation is clockwise around the x axis and specified in degrees from 0 to 360. 
     * <roll> Rotation about the y axis. A positive rotation is clockwise around the y 
     * axis and specified in degrees from 0 to 360. This diagram illustrates the typical 
     * orientation of a model's axes: 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "0.0")
    protected double roll = 0.0D;
    /**
     * AltitudeMode
     * <p>
     * clampToGround, relativeToGround, absolute 
     * </p>
     * 
     * See Also: 
     * See <LookAt> and <Region>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "clampToGround")
    protected AltitudeMode altitudeMode = AltitudeMode.CLAMP_TO_GROUND;
    @XmlElement(name = "CameraSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> cameraSimpleExtension;
    /**
     * <Object>
     * <p>
     * This is an abstract base class and cannot be used directly in a KML file. It provides 
     * the id attribute, which allows unique identification of a KML element, and the targetId 
     * attribute, which is used to reference objects that have already been loaded into 
     * Google Earth. The id attribute must be assigned if the <Update> mechanism is to 
     * be used. 
     * </p>
     * 
     * Syntax: 
     * <pre>&lt;!-- abstract element; do not create --&gt;<strong>
     * &lt;!-- <em>Object</em> id="ID" targetId="NCName" --&gt;
     * &lt;!-- /<em>Object</em>&gt; --&gt;</strong></pre>
     * 
     * 
     * 
     */
    @XmlElement(name = "CameraObjectExtensionGroup")
    protected List<AbstractObject> cameraObjectExtension;

    public Camera() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getLongitude() {
        return longitude;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setLongitude(double value) {
        this.longitude = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setLatitude(double value) {
        this.latitude = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setAltitude(double value) {
        this.altitude = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getHeading() {
        return heading;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setHeading(double value) {
        this.heading = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getTilt() {
        return tilt;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setTilt(double value) {
        this.tilt = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Double}
     *     
     */
    public double getRoll() {
        return roll;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Double}
     *     
     */
    public void setRoll(double value) {
        this.roll = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@code <}{@link Object}{@code>}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.gx.AltitudeMode}{@code>}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.AltitudeMode}{@code>}
     *     
     */
    public AltitudeMode getAltitudeMode() {
        return altitudeMode;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@code <}{@link Object}{@code>}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.gx.AltitudeMode}{@code>}
     *     {@code <}{@link de.micromata.opengis.kml.v_2_2_0.AltitudeMode}{@code>}
     *     
     */
    public void setAltitudeMode(AltitudeMode value) {
        this.altitudeMode = value;
    }

    /**
     * 
     */
    public List<Object> getCameraSimpleExtension() {
        if (cameraSimpleExtension == null) {
            cameraSimpleExtension = new ArrayList<Object>();
        }
        return this.cameraSimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getCameraObjectExtension() {
        if (cameraObjectExtension == null) {
            cameraObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.cameraObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(longitude);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(latitude);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(altitude);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(heading);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(tilt);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        temp = Double.doubleToLongBits(roll);
        result = ((prime*result)+((int)(temp^(temp >>>(32)))));
        result = ((prime*result)+((altitudeMode == null)? 0 :altitudeMode.hashCode()));
        result = ((prime*result)+((cameraSimpleExtension == null)? 0 :cameraSimpleExtension.hashCode()));
        result = ((prime*result)+((cameraObjectExtension == null)? 0 :cameraObjectExtension.hashCode()));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (super.equals(obj) == false) {
            return false;
        }
        if ((obj instanceof Camera) == false) {
            return false;
        }
        Camera other = ((Camera) obj);
        if (longitude!= other.longitude) {
            return false;
        }
        if (latitude!= other.latitude) {
            return false;
        }
        if (altitude!= other.altitude) {
            return false;
        }
        if (heading!= other.heading) {
            return false;
        }
        if (tilt!= other.tilt) {
            return false;
        }
        if (roll!= other.roll) {
            return false;
        }
        if (altitudeMode == null) {
            if (other.altitudeMode!= null) {
                return false;
            }
        } else {
            if (altitudeMode.equals(other.altitudeMode) == false) {
                return false;
            }
        }
        if (cameraSimpleExtension == null) {
            if (other.cameraSimpleExtension!= null) {
                return false;
            }
        } else {
            if (cameraSimpleExtension.equals(other.cameraSimpleExtension) == false) {
                return false;
            }
        }
        if (cameraObjectExtension == null) {
            if (other.cameraObjectExtension!= null) {
                return false;
            }
        } else {
            if (cameraObjectExtension.equals(other.cameraObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sets the value of the cameraSimpleExtension property Objects of the following type(s) are allowed in the list List<Object>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withCameraSimpleExtension} instead.
     * 
     * 
     * @param cameraSimpleExtension
     */
    public void setCameraSimpleExtension(final List<Object> cameraSimpleExtension) {
        this.cameraSimpleExtension = cameraSimpleExtension;
    }

    /**
     * add a value to the cameraSimpleExtension property collection
     * 
     * @param cameraSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public Camera addToCameraSimpleExtension(final Object cameraSimpleExtension) {
        this.getCameraSimpleExtension().add(cameraSimpleExtension);
        return this;
    }

    /**
     * Sets the value of the cameraObjectExtension property Objects of the following type(s) are allowed in the list List<AbstractObject>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withCameraObjectExtension} instead.
     * 
     * 
     * @param cameraObjectExtension
     */
    public void setCameraObjectExtension(final List<AbstractObject> cameraObjectExtension) {
        this.cameraObjectExtension = cameraObjectExtension;
    }

    /**
     * add a value to the cameraObjectExtension property collection
     * 
     * @param cameraObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public Camera addToCameraObjectExtension(final AbstractObject cameraObjectExtension) {
        this.getCameraObjectExtension().add(cameraObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public Camera addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setAbstractViewSimpleExtension(final List<Object> abstractViewSimpleExtension) {
        super.setAbstractViewSimpleExtension(abstractViewSimpleExtension);
    }

    @Obvious
    @Override
    public Camera addToAbstractViewSimpleExtension(final Object abstractViewSimpleExtension) {
        super.getAbstractViewSimpleExtension().add(abstractViewSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setAbstractViewObjectExtension(final List<AbstractObject> abstractViewObjectExtension) {
        super.setAbstractViewObjectExtension(abstractViewObjectExtension);
    }

    @Obvious
    @Override
    public Camera addToAbstractViewObjectExtension(final AbstractObject abstractViewObjectExtension) {
        super.getAbstractViewObjectExtension().add(abstractViewObjectExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param longitude
     *     required parameter
     */
    public Camera withLongitude(final double longitude) {
        this.setLongitude(longitude);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param latitude
     *     required parameter
     */
    public Camera withLatitude(final double latitude) {
        this.setLatitude(latitude);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param altitude
     *     required parameter
     */
    public Camera withAltitude(final double altitude) {
        this.setAltitude(altitude);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param heading
     *     required parameter
     */
    public Camera withHeading(final double heading) {
        this.setHeading(heading);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param tilt
     *     required parameter
     */
    public Camera withTilt(final double tilt) {
        this.setTilt(tilt);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param roll
     *     required parameter
     */
    public Camera withRoll(final double roll) {
        this.setRoll(roll);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param altitudeMode
     *     required parameter
     */
    public Camera withAltitudeMode(final  AltitudeMode altitudeMode) {
        this.setAltitudeMode(altitudeMode);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param cameraSimpleExtension
     *     required parameter
     */
    public Camera withCameraSimpleExtension(final List<Object> cameraSimpleExtension) {
        this.setCameraSimpleExtension(cameraSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param cameraObjectExtension
     *     required parameter
     */
    public Camera withCameraObjectExtension(final List<AbstractObject> cameraObjectExtension) {
        this.setCameraObjectExtension(cameraObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public Camera withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Camera withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public Camera withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public Camera withAbstractViewSimpleExtension(final List<Object> abstractViewSimpleExtension) {
        super.withAbstractViewSimpleExtension(abstractViewSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public Camera withAbstractViewObjectExtension(final List<AbstractObject> abstractViewObjectExtension) {
        super.withAbstractViewObjectExtension(abstractViewObjectExtension);
        return this;
    }

}