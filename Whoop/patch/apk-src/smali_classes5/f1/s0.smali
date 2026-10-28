.class public abstract Lf1/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ld0/o;

.field public static final b:Ld0/f2;

.field public static final c:J

.field public static final d:Ld0/i1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Ld0/o;

    const/high16 v1, 0x7fc00000    # Float.NaN

    invoke-direct {v0, v1, v1}, Ld0/o;-><init>(FF)V

    sput-object v0, Lf1/s0;->a:Ld0/o;

    new-instance v0, Lev2/b;

    const/16 v1, 0x17

    invoke-direct {v0, v1}, Lev2/b;-><init>(I)V

    new-instance v1, Lev2/b;

    const/16 v2, 0x18

    invoke-direct {v1, v2}, Lev2/b;-><init>(I)V

    new-instance v2, Ld0/f2;

    invoke-direct {v2, v0, v1}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    sput-object v2, Lf1/s0;->b:Ld0/f2;

    const v0, 0x3c23d70a    # 0.01f

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    const/16 v0, 0x20

    shl-long v0, v1, v0

    const-wide v5, 0xffffffffL

    and-long v2, v3, v5

    or-long/2addr v0, v2

    sput-wide v0, Lf1/s0;->c:J

    new-instance v2, Ld0/i1;

    new-instance v3, Lh2/b;

    invoke-direct {v3, v0, v1}, Lh2/b;-><init>(J)V

    const/4 v0, 0x3

    invoke-direct {v2, v3, v0}, Ld0/i1;-><init>(Ljava/lang/Object;I)V

    sput-object v2, Lf1/s0;->d:Ld0/i1;

    return-void
.end method
