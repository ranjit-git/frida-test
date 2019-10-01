package com.mega.app.p025h4.p026g;

import android.content.Context;
import com.google.firebase.perf.a;
import com.google.firebase.perf.metrics.Trace;
import com.scottyab.rootbeer.C1743b;
import kotlin.p130t.p132d.C3747m;

/* renamed from: com.test.app.h4.g.a */
/* compiled from: Root.kt */
public final class C0811a {

    /* renamed from: a */
    public static final C0811a f2135a = new C0811a();

    private C0811a() {
    }

    /* renamed from: a */
    public final boolean mo3581a(Context context) {
        Trace a = a.a("Root.Check");
        C3747m.m10525b(context, "context");
        boolean j = new C1743b(context).mo7003j();
        a.stop();
        return j;
    }
}
