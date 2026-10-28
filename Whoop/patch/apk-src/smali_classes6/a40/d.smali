.class public abstract La40/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, La2/d;

    const/4 v1, 0x2

    invoke-direct {v0, v1}, La2/d;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, La40/d;->a:Lp1/u2;

    return-void
.end method
