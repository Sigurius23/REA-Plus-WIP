.class public final Lj3/a;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Lj3/b;

.field public final synthetic x:Lj3/d;

.field public final synthetic y:J


# direct methods
.method public constructor <init>(Lj3/b;Lj3/d;J)V
    .locals 0

    iput-object p1, p0, Lj3/a;->w:Lj3/b;

    iput-object p2, p0, Lj3/a;->x:Lj3/d;

    iput-wide p3, p0, Lj3/a;->y:J

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    iget-object p1, p0, Lj3/a;->w:Lj3/b;

    iget-object v0, p1, Lj3/b;->b:Lj3/e;

    iget-object v1, p0, Lj3/a;->x:Lj3/d;

    iget-wide v6, p0, Lj3/a;->y:J

    invoke-virtual/range {v0 .. v7}, Lj3/e;->b(Lj3/d;JJJ)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
