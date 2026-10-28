.class public final Leu/m0;
.super Lkotlin/jvm/internal/m;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:Ljava/util/List;

.field public final synthetic x:J


# direct methods
.method public constructor <init>(Ljava/util/List;JLwp/c;Lwp/c;I)V
    .locals 0

    iput-object p1, p0, Leu/m0;->w:Ljava/util/List;

    iput-wide p2, p0, Leu/m0;->x:J

    const/4 p1, 0x2

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/m;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    check-cast p1, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    iget-wide v0, p0, Leu/m0;->x:J

    const/4 p2, 0x1

    iget-object v2, p0, Leu/m0;->w:Ljava/util/List;

    invoke-static {v0, v1, v2, p1, p2}, Lbi/g;->f(JLjava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
