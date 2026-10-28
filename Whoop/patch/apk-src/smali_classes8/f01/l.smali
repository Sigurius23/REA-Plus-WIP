.class public final synthetic Lf01/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic w:Lf01/q;

.field public final synthetic x:Z

.field public final synthetic y:Lf01/i;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lf01/q;ZLf01/i;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf01/l;->w:Lf01/q;

    iput-boolean p2, p0, Lf01/l;->x:Z

    iput-object p3, p0, Lf01/l;->y:Lf01/i;

    iput-object p4, p0, Lf01/l;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lf01/l;->E:Lp1/c1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-object v0, p0, Lf01/l;->w:Lf01/q;

    iget-boolean v1, p0, Lf01/l;->x:Z

    iget-object v2, p0, Lf01/l;->y:Lf01/i;

    iget-object v3, p0, Lf01/l;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lf01/l;->E:Lp1/c1;

    invoke-static/range {v0 .. v6}, Lf01/n;->h(Lf01/q;ZLf01/i;Lkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
