.class public final Loy/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:J

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JLl3/v0;ZZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loy/f;->w:Ljava/lang/String;

    iput-wide p2, p0, Loy/f;->x:J

    iput-object p4, p0, Loy/f;->y:Ll3/v0;

    iput-boolean p5, p0, Loy/f;->z:Z

    iput-boolean p6, p0, Loy/f;->E:Z

    iput-boolean p7, p0, Loy/f;->F:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    check-cast p1, Ll0/s1;

    check-cast p2, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->intValue()I

    move-result p3

    const-string v0, "$this$TextButton"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 p3, 0x10

    if-ne p1, p3, :cond_1

    move-object p1, p2

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->F()Z

    move-result p3

    if-nez p3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    sget-object p1, Lg1/j1;->a:Lp1/b0;

    move-object v7, p2

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    iget-wide p2, p0, Loy/f;->x:J

    invoke-static {p1, p2, p3}, Li2/x;->c(FJ)J

    move-result-wide v1

    iget-boolean v6, p0, Loy/f;->F:Z

    const/4 v8, 0x0

    iget-object v0, p0, Loy/f;->w:Ljava/lang/String;

    iget-object v3, p0, Loy/f;->y:Ll3/v0;

    iget-boolean v4, p0, Loy/f;->z:Z

    iget-boolean v5, p0, Loy/f;->E:Z

    invoke-static/range {v0 .. v8}, Lio/sentry/config/a;->j(Ljava/lang/String;JLl3/v0;ZZZLandroidx/compose/runtime/Composer;I)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
