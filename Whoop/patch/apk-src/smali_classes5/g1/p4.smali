.class public final synthetic Lg1/p4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:J

.field public final synthetic x:F

.field public final synthetic y:J


# direct methods
.method public synthetic constructor <init>(JJF)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lg1/p4;->w:J

    iput p5, p0, Lg1/p4;->x:F

    iput-wide p3, p0, Lg1/p4;->y:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    move-object v5, p1

    check-cast v5, Lk2/e;

    invoke-interface {v5}, Lk2/e;->d()J

    move-result-wide v0

    const-wide v2, 0xffffffffL

    and-long/2addr v0, v2

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/4 v0, 0x0

    const/high16 v1, 0x3f800000    # 1.0f

    iget-wide v2, p0, Lg1/p4;->w:J

    invoke-static/range {v0 .. v5}, Lg1/v4;->f(FFJFLk2/e;)V

    iget v1, p0, Lg1/p4;->x:F

    iget-wide v2, p0, Lg1/p4;->y:J

    invoke-static/range {v0 .. v5}, Lg1/v4;->f(FFJFLk2/e;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
