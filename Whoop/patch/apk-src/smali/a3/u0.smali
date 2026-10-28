.class public final La3/u0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:La3/w0;

.field public final synthetic x:J

.field public final synthetic y:J

.field public final synthetic z:La3/e2;


# direct methods
.method public constructor <init>(La3/w0;JJLa3/e2;)V
    .locals 0

    iput-object p1, p0, La3/u0;->w:La3/w0;

    iput-wide p2, p0, La3/u0;->x:J

    iput-wide p4, p0, La3/u0;->y:J

    iput-object p6, p0, La3/u0;->z:La3/e2;

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, La3/u0;->w:La3/w0;

    invoke-virtual {v0}, La3/w0;->R0()La3/t0;

    move-result-object v1

    const/4 v2, 0x0

    iput-boolean v2, v1, La3/t0;->w:Z

    invoke-virtual {v0}, La3/w0;->R0()La3/t0;

    move-result-object v1

    iget-wide v2, p0, La3/u0;->x:J

    iput-wide v2, v1, La3/t0;->x:J

    invoke-virtual {v0}, La3/w0;->R0()La3/t0;

    move-result-object v1

    iget-wide v2, p0, La3/u0;->y:J

    iput-wide v2, v1, La3/t0;->y:J

    iget-object v1, p0, La3/u0;->z:La3/e2;

    iget-object v1, v1, La3/e2;->w:Ly2/s0;

    invoke-interface {v1}, Ly2/s0;->c()Lkotlin/jvm/functions/Function1;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, La3/w0;->R0()La3/t0;

    move-result-object v0

    invoke-interface {v1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
