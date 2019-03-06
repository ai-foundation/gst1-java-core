/*
 * Copyright (c) 2019 Antonio Morales
 *
 * This file is part of gstreamer-java.
 *
 * This code is free software: you can redistribute it and/or modify it under the terms of the GNU
 * Lesser General Public License version 3 only, as published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License version 3 along with
 * this work. If not, see <http://www.gnu.org/licenses/>.
 */

package org.freedesktop.gstreamer.webrtc;

import org.freedesktop.gstreamer.Gst;
import org.freedesktop.gstreamer.GstObject;

/**
 *
 * @see https://gitlab.freedesktop.org/gstreamer/gst-plugins-bad/blob/master/ext/webrtc/webrtcdatachannel.h
 * available since Gstreamer 1.14
 */
@Gst.Since(minor = 14)
public class WebRTCRTPTransceiver extends GstObject {
    public static final String GTYPE_NAME = "GstWebRTCRTPTransceiver";

    public WebRTCRTPTransceiver(Initializer init) {
        super(init);
    }
}
