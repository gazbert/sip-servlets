/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2015, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This program is free software: you can redistribute it and/or modify
 * under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation; either version 3 of
 * the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */
package org.mobicents.metadata.sip.spec;

import org.jboss.metadata.javaee.support.IdMetaDataImpl;

/**
 * sip-app/servlet-mapping/pattern metadata
 *
 * @author jean.deruelle@gmail.com
 * @version $Revision$
 *
 *          This class is based on the contents of org.mobicents.metadata.sip.spec package from jboss-as7-mobicents project,
 *          re-implemented for jboss as10 (wildfly) by:
 * @author kakonyi.istvan@alerant.hu
 */
public class PatternMetaData extends IdMetaDataImpl {

    private static final long serialVersionUID = 1;
    private ConditionMetaData condition;

    /**
     * @param condition the condition to set
     */
    public void setCondition(ConditionMetaData condition) {
        this.condition = condition;
    }

    /**
     * @return the condition
     */
    public ConditionMetaData getCondition() {
        return condition;
    }

}
