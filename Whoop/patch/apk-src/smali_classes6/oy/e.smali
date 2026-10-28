.class public final synthetic Loy/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:Z

.field public final synthetic w:Ljava/lang/String;

.field public final synthetic x:J

.field public final synthetic y:Ll3/v0;

.field public final synthetic z:Z


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JLl3/v0;ZZZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Loy/e;->w:Ljava/lang/String;

    iput-wide p2, p0, Loy/e;->x:J

    iput-object p4, p0, Loy/e;->y:Ll3/v0;

    iput-boolean p5, p0, Loy/e;->z:Z

    iput-boolean p6, p0, Loy/e;->E:Z

    iput-boolean p7, p0, Loy/e;->F:Z

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v7, p1

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v8

    iget-object v0, p0, Loy/e;->w:Ljava/lang/String;

    iget-wide v1, p0, Loy/e;->x:J

    iget-object v3, p0, Loy/e;->y:Ll3/v0;

    iget-boolean v4, p0, Loy/e;->z:Z

    iget-boolean v5, p0, Loy/e;->E:Z

    iget-boolean v6, p0, Loy/e;->F:Z

    invoke-static/range {v0 .. v8}, Lio/sentry/config/a;->j(Ljava/lang/String;JLl3/v0;ZZZLandroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
