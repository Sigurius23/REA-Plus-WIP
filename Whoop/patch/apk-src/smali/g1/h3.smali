.class public abstract Lg1/h3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;

.field public static final b:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lep0/a;

    const/16 v1, 0x11

    invoke-direct {v0, v1}, Lep0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg1/h3;->a:Lp1/u2;

    const/16 v0, 0x30

    int-to-float v0, v0

    invoke-static {v0, v0}, Lvf3/b;->a(FF)J

    move-result-wide v0

    sput-wide v0, Lg1/h3;->b:J

    return-void
.end method
