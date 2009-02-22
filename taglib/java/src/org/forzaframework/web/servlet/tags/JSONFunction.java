/*
 * Copyright 2006-2009 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.forzaframework.web.servlet.tags;

/**
 * User: cesarreyes
 * Date: 14-ene-2007
 * Time: 1:17:18
 * Description:
 */
public class JSONFunction extends net.sf.json.JSONFunction {

    public JSONFunction(String text) {
        super(text);
    }

    public JSONFunction(String[] params, String text) {
        super(params, text);
    }


    public String toString() {
        StringBuffer b = new StringBuffer(getText());
        return b.toString();
    }
}
