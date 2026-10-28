.class public final synthetic Ll80/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lkotlin/jvm/functions/Function1;

.field public final synthetic F:Lkotlin/jvm/functions/Function1;

.field public final synthetic G:Lc93/r;

.field public final synthetic H:Lp1/t2;

.field public final synthetic w:Lf80/a;

.field public final synthetic x:Lf80/d;

.field public final synthetic y:Lf80/e;

.field public final synthetic z:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lf80/a;Lf80/d;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll80/g;->w:Lf80/a;

    iput-object p2, p0, Ll80/g;->x:Lf80/d;

    iput-object p3, p0, Ll80/g;->y:Lf80/e;

    iput-object p4, p0, Ll80/g;->z:Lkotlin/jvm/functions/Function1;

    iput-object p5, p0, Ll80/g;->E:Lkotlin/jvm/functions/Function1;

    iput-object p6, p0, Ll80/g;->F:Lkotlin/jvm/functions/Function1;

    iput-object p7, p0, Ll80/g;->G:Lc93/r;

    iput-object p8, p0, Ll80/g;->H:Lp1/t2;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    move-object v8, p1

    check-cast v8, Lc0/o;

    move-object v9, p2

    check-cast v9, Leb/q;

    move-object v10, p3

    check-cast v10, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v0, p0, Ll80/g;->w:Lf80/a;

    iget-object v1, p0, Ll80/g;->x:Lf80/d;

    iget-object v2, p0, Ll80/g;->y:Lf80/e;

    iget-object v3, p0, Ll80/g;->z:Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Ll80/g;->E:Lkotlin/jvm/functions/Function1;

    iget-object v5, p0, Ll80/g;->F:Lkotlin/jvm/functions/Function1;

    iget-object v6, p0, Ll80/g;->G:Lc93/r;

    iget-object v7, p0, Ll80/g;->H:Lp1/t2;

    invoke-static/range {v0 .. v11}, Ll80/n;->u(Lf80/a;Lf80/d;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Lp1/t2;Lc0/o;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
