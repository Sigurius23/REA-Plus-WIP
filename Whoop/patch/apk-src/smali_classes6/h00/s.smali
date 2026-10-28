.class public final synthetic Lh00/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lkotlin/jvm/functions/Function1;

.field public final synthetic H:Lkotlin/jvm/functions/Function1;

.field public final synthetic I:Lc93/a;

.field public final synthetic J:Lwz/e1;

.field public final synthetic K:Lc93/a;

.field public final synthetic w:Leb/u0;

.field public final synthetic x:Lc93/a;

.field public final synthetic y:Lc93/a;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Leb/u0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lwz/e1;Lc93/a;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh00/s;->w:Leb/u0;

    iput-object p2, p0, Lh00/s;->x:Lc93/a;

    iput-object p3, p0, Lh00/s;->y:Lc93/a;

    iput-object p4, p0, Lh00/s;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Lh00/s;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Lh00/s;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Lh00/s;->G:Lkotlin/jvm/functions/Function1;

    iput-object p8, p0, Lh00/s;->H:Lkotlin/jvm/functions/Function1;

    iput-object p9, p0, Lh00/s;->I:Lc93/a;

    iput-object p10, p0, Lh00/s;->J:Lwz/e1;

    iput-object p11, p0, Lh00/s;->K:Lc93/a;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    move-object v11, p1

    check-cast v11, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result v12

    iget-object v0, p0, Lh00/s;->w:Leb/u0;

    iget-object v1, p0, Lh00/s;->x:Lc93/a;

    iget-object v2, p0, Lh00/s;->y:Lc93/a;

    iget-object v3, p0, Lh00/s;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lh00/s;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Lh00/s;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Lh00/s;->G:Lkotlin/jvm/functions/Function1;

    iget-object v7, p0, Lh00/s;->H:Lkotlin/jvm/functions/Function1;

    iget-object v8, p0, Lh00/s;->I:Lc93/a;

    iget-object v9, p0, Lh00/s;->J:Lwz/e1;

    iget-object v10, p0, Lh00/s;->K:Lc93/a;

    invoke-static/range {v0 .. v12}, Ltx/f;->k(Leb/u0;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lwz/e1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
