/*
 * Copyright (c) 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package jdk.nashorn.api.tree;

/**
 * A tree node for <a href="http://www.ecma-international.org/ecma-262/6.0/#sec-for-in-and-for-of-statements">for..of statement</a>.
 *
 * For example:
 * <pre>
 *   for ( <em>variable</em> of <em>expression</em> )
 *       <em>statement</em>
 * </pre>
 *
 * @deprecated Nashorn JavaScript script engine and APIs, and the jjs tool
 * are deprecated with the intent to remove them in a future release.
 *
 * @since 9
 */
@Deprecated(since="11", forRemoval=true)
public interface ForOfLoopTree extends LoopTree {
    /**
     * The for..of left hand side expression.
     *
     * @return the left hand side expression
     */
    ExpressionTree getVariable();

    /**
     * The object or array being whose properties are iterated.
     *
     * @return the object or array expression being iterated
     */
    ExpressionTree getExpression();

    /**
     * The statement contained in this for..of statement.
     *
     * @return the statement
     */
    @Override
    StatementTree getStatement();
}

