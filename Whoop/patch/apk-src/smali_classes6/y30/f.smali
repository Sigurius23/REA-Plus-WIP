.class public final Ly30/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly30/e;


# instance fields
.field public final a:Lb20/f;


# direct methods
.method public constructor <init>(Lb20/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly30/f;->a:Lb20/f;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing Google Places dependency, please add it to your apps build.gradle"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object p2, Lb20/e;->K:Lb20/e;

    const/4 v0, 0x0

    const/4 v1, 0x6

    iget-object v2, p0, Ly30/f;->a:Lb20/f;

    invoke-static {v2, p2, v0, v0, v1}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method

.method public final b(Ljava/lang/String;Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .locals 1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "Missing Google Places dependency, please add it to your apps build.gradle"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    sget-object p2, Lb20/e;->J:Lb20/e;

    const/4 p3, 0x0

    const/4 p4, 0x6

    iget-object v0, p0, Ly30/f;->a:Lb20/f;

    invoke-static {v0, p2, p3, p3, p4}, Lvd/f;->H(Lb20/f;Lb20/b;Lcom/stripe/android/core/exception/StripeException;Ljava/util/Map;I)V

    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1
.end method
