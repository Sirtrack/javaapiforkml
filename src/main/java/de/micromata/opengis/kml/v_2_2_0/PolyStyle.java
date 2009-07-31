
package de.micromata.opengis.kml.v_2_2_0;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import de.micromata.opengis.kml.v_2_2_0.annotations.Obvious;


/**
 * <PolyStyle>
 * Syntax: 
 * <pre><strong>&lt;PolyStyle id="ID"&gt;</strong>
 *   &lt;!-- inherited from <em>ColorStyle</em> --&gt;
 *   &lt;color&gt;ffffffff&lt;/color&gt;            &lt;!-- kml:color --&gt;
 *   &lt;colorMode&gt;normal&lt;/colorMode&gt;      &lt;!-- kml:colorModeEnum: normal <em>or</em> random --&gt;
 * 
 *   &lt;!-- specific to PolyStyle --&gt;
 *   &lt;fill&gt;1&lt;/fill&gt;                     &lt;!-- boolean --&gt;
 *   &lt;outline&gt;1&lt;/outline&gt;               &lt;!-- boolean --&gt;
 * <strong>&lt;/PolyStyle&gt;</strong></pre>
 * 
 * Extends: 
 * @see: <ColorStyle>
 * 
 * Contained By: 
 * @see: <Style>
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolyStyleType", propOrder = {
    "fill",
    "outline",
    "polyStyleSimpleExtension",
    "polyStyleObjectExtension"
})
@XmlRootElement(name = "PolyStyle", namespace = "http://www.opengis.net/kml/2.2")
public class PolyStyle
    extends ColorStyle
{

    /**
     * <fill>
     * <p>
     * Boolean value. Specifies whether to fill the polygon. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "1")
    protected Boolean fill = false;
    /**
     * <outline>
     * <p>
     * Boolean value. Specifies whether to outline the polygon. Polygon outlines use the 
     * current LineStyle. 
     * </p>
     * 
     * 
     * 
     */
    @XmlElement(defaultValue = "1")
    protected Boolean outline = false;
    @XmlElement(name = "PolyStyleSimpleExtensionGroup")
    @XmlSchemaType(name = "anySimpleType")
    protected List<Object> polyStyleSimpleExtension;
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
    @XmlElement(name = "PolyStyleObjectExtensionGroup")
    protected List<AbstractObject> polyStyleObjectExtension;

    public PolyStyle() {
        super();
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isFill() {
        return fill;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setFill(Boolean value) {
        this.fill = value;
    }

    /**
     * 
     * @return
     *     possible object is
     *     {@link Boolean}
     *     
     */
    public Boolean isOutline() {
        return outline;
    }

    /**
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean}
     *     
     */
    public void setOutline(Boolean value) {
        this.outline = value;
    }

    /**
     * 
     */
    public List<Object> getPolyStyleSimpleExtension() {
        if (polyStyleSimpleExtension == null) {
            polyStyleSimpleExtension = new ArrayList<Object>();
        }
        return this.polyStyleSimpleExtension;
    }

    /**
     * 
     */
    public List<AbstractObject> getPolyStyleObjectExtension() {
        if (polyStyleObjectExtension == null) {
            polyStyleObjectExtension = new ArrayList<AbstractObject>();
        }
        return this.polyStyleObjectExtension;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = super.hashCode();
        result = ((prime*result)+((fill == null)? 0 :fill.hashCode()));
        result = ((prime*result)+((outline == null)? 0 :outline.hashCode()));
        result = ((prime*result)+((polyStyleSimpleExtension == null)? 0 :polyStyleSimpleExtension.hashCode()));
        result = ((prime*result)+((polyStyleObjectExtension == null)? 0 :polyStyleObjectExtension.hashCode()));
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
        if ((obj instanceof PolyStyle) == false) {
            return false;
        }
        PolyStyle other = ((PolyStyle) obj);
        if (fill == null) {
            if (other.fill!= null) {
                return false;
            }
        } else {
            if (fill.equals(other.fill) == false) {
                return false;
            }
        }
        if (outline == null) {
            if (other.outline!= null) {
                return false;
            }
        } else {
            if (outline.equals(other.outline) == false) {
                return false;
            }
        }
        if (polyStyleSimpleExtension == null) {
            if (other.polyStyleSimpleExtension!= null) {
                return false;
            }
        } else {
            if (polyStyleSimpleExtension.equals(other.polyStyleSimpleExtension) == false) {
                return false;
            }
        }
        if (polyStyleObjectExtension == null) {
            if (other.polyStyleObjectExtension!= null) {
                return false;
            }
        } else {
            if (polyStyleObjectExtension.equals(other.polyStyleObjectExtension) == false) {
                return false;
            }
        }
        return true;
    }

    /**
     * Sets the value of the polyStyleSimpleExtension property Objects of the following type(s) are allowed in the list List<Object>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPolyStyleSimpleExtension} instead.
     * 
     * 
     * @param polyStyleSimpleExtension
     */
    public void setPolyStyleSimpleExtension(final List<Object> polyStyleSimpleExtension) {
        this.polyStyleSimpleExtension = polyStyleSimpleExtension;
    }

    /**
     * add a value to the polyStyleSimpleExtension property collection
     * 
     * @param polyStyleSimpleExtension
     *     Objects of the following type are allowed in the list: {@link Object}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public PolyStyle addToPolyStyleSimpleExtension(final Object polyStyleSimpleExtension) {
        this.getPolyStyleSimpleExtension().add(polyStyleSimpleExtension);
        return this;
    }

    /**
     * Sets the value of the polyStyleObjectExtension property Objects of the following type(s) are allowed in the list List<AbstractObject>.
     * <p>Note:
     * <p>This method does not make use of the fluent pattern.If you would like to make it fluent, use {@link #withPolyStyleObjectExtension} instead.
     * 
     * 
     * @param polyStyleObjectExtension
     */
    public void setPolyStyleObjectExtension(final List<AbstractObject> polyStyleObjectExtension) {
        this.polyStyleObjectExtension = polyStyleObjectExtension;
    }

    /**
     * add a value to the polyStyleObjectExtension property collection
     * 
     * @param polyStyleObjectExtension
     *     Objects of the following type are allowed in the list: {@link AbstractObject}
     * @return
     *     <tt>true</tt> (as general contract of <tt>Collection.add</tt>). 
     */
    public PolyStyle addToPolyStyleObjectExtension(final AbstractObject polyStyleObjectExtension) {
        this.getPolyStyleObjectExtension().add(polyStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public void setObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.setObjectSimpleExtension(objectSimpleExtension);
    }

    @Obvious
    @Override
    public PolyStyle addToObjectSimpleExtension(final Object objectSimpleExtension) {
        super.getObjectSimpleExtension().add(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        super.setSubStyleSimpleExtension(subStyleSimpleExtension);
    }

    @Obvious
    @Override
    public PolyStyle addToSubStyleSimpleExtension(final Object subStyleSimpleExtension) {
        super.getSubStyleSimpleExtension().add(subStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        super.setSubStyleObjectExtension(subStyleObjectExtension);
    }

    @Obvious
    @Override
    public PolyStyle addToSubStyleObjectExtension(final AbstractObject subStyleObjectExtension) {
        super.getSubStyleObjectExtension().add(subStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public void setColorStyleSimpleExtension(final List<Object> colorStyleSimpleExtension) {
        super.setColorStyleSimpleExtension(colorStyleSimpleExtension);
    }

    @Obvious
    @Override
    public PolyStyle addToColorStyleSimpleExtension(final Object colorStyleSimpleExtension) {
        super.getColorStyleSimpleExtension().add(colorStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public void setColorStyleObjectExtension(final List<AbstractObject> colorStyleObjectExtension) {
        super.setColorStyleObjectExtension(colorStyleObjectExtension);
    }

    @Obvious
    @Override
    public PolyStyle addToColorStyleObjectExtension(final AbstractObject colorStyleObjectExtension) {
        super.getColorStyleObjectExtension().add(colorStyleObjectExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param fill
     *     required parameter
     */
    public PolyStyle withFill(final Boolean fill) {
        this.setFill(fill);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param outline
     *     required parameter
     */
    public PolyStyle withOutline(final Boolean outline) {
        this.setOutline(outline);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param polyStyleSimpleExtension
     *     required parameter
     */
    public PolyStyle withPolyStyleSimpleExtension(final List<Object> polyStyleSimpleExtension) {
        this.setPolyStyleSimpleExtension(polyStyleSimpleExtension);
        return this;
    }

    /**
     * fluent setter
     * 
     * @param polyStyleObjectExtension
     *     required parameter
     */
    public PolyStyle withPolyStyleObjectExtension(final List<AbstractObject> polyStyleObjectExtension) {
        this.setPolyStyleObjectExtension(polyStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withObjectSimpleExtension(final List<Object> objectSimpleExtension) {
        super.withObjectSimpleExtension(objectSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withId(final String id) {
        super.withId(id);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withTargetId(final String targetId) {
        super.withTargetId(targetId);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withSubStyleSimpleExtension(final List<Object> subStyleSimpleExtension) {
        super.withSubStyleSimpleExtension(subStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withSubStyleObjectExtension(final List<AbstractObject> subStyleObjectExtension) {
        super.withSubStyleObjectExtension(subStyleObjectExtension);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withColor(final String color) {
        super.withColor(color);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withColorMode(final ColorMode colorMode) {
        super.withColorMode(colorMode);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withColorStyleSimpleExtension(final List<Object> colorStyleSimpleExtension) {
        super.withColorStyleSimpleExtension(colorStyleSimpleExtension);
        return this;
    }

    @Obvious
    @Override
    public PolyStyle withColorStyleObjectExtension(final List<AbstractObject> colorStyleObjectExtension) {
        super.withColorStyleObjectExtension(colorStyleObjectExtension);
        return this;
    }

}