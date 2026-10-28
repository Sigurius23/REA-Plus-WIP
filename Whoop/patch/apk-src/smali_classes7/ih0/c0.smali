.class public final synthetic Lih0/c0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/n;


# instance fields
.field public final synthetic E:Lp1/c1;

.field public final synthetic F:Ln83/f;

.field public final synthetic G:Lz1/s;

.field public final synthetic H:Lp1/c1;

.field public final synthetic I:Lkotlin/jvm/functions/Function1;

.field public final synthetic J:Lkotlin/jvm/functions/Function1;

.field public final synthetic w:Lah0/c;

.field public final synthetic x:Ljava/util/Set;

.field public final synthetic y:Lq3/y;

.field public final synthetic z:Lp1/c1;


# direct methods
.method public synthetic constructor <init>(Lah0/c;Ljava/util/Set;Lq3/y;Lp1/c1;Lp1/c1;Ln83/f;Lz1/s;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lih0/c0;->w:Lah0/c;

    iput-object p2, p0, Lih0/c0;->x:Ljava/util/Set;

    iput-object p3, p0, Lih0/c0;->y:Lq3/y;

    iput-object p4, p0, Lih0/c0;->z:Lp1/c1;

    iput-object p5, p0, Lih0/c0;->E:Lp1/c1;

    iput-object p6, p0, Lih0/c0;->F:Ln83/f;

    iput-object p7, p0, Lih0/c0;->G:Lz1/s;

    iput-object p8, p0, Lih0/c0;->H:Lp1/c1;

    iput-object p9, p0, Lih0/c0;->I:Lkotlin/jvm/functions/Function1;

    iput-object p10, p0, Lih0/c0;->J:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    move-object v10, p1

    check-cast v10, Lc0/o;

    move-object/from16 v11, p2

    check-cast v11, Lah0/c;

    move-object/from16 v12, p3

    check-cast v12, Landroidx/compose/runtime/Composer;

    move-object/from16 p1, p4

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v13

    iget-object v0, p0, Lih0/c0;->w:Lah0/c;

    iget-object v1, p0, Lih0/c0;->x:Ljava/util/Set;

    iget-object v2, p0, Lih0/c0;->y:Lq3/y;

    iget-object v3, p0, Lih0/c0;->z:Lp1/c1;

    iget-object v4, p0, Lih0/c0;->E:Lp1/c1;

    iget-object v5, p0, Lih0/c0;->F:Ln83/f;

    iget-object v6, p0, Lih0/c0;->G:Lz1/s;

    iget-object v7, p0, Lih0/c0;->H:Lp1/c1;

    iget-object v8, p0, Lih0/c0;->I:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lih0/c0;->J:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v13}, Lih0/e0;->w(Lah0/c;Ljava/util/Set;Lq3/y;Lp1/c1;Lp1/c1;Ln83/f;Lz1/s;Lp1/c1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc0/o;Lah0/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
