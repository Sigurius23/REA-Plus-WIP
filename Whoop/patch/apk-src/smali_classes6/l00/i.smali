.class public final Ll00/i;
.super Landroidx/lifecycle/w1;
.source "SourceFile"


# instance fields
.field public final E:Lec3/h2;

.field public final w:Ld00/l;

.field public final x:Lxz/x;

.field public final y:Lkotlin/jvm/functions/Function1;

.field public final z:Lec3/h2;


# direct methods
.method public constructor <init>(Ld00/l;Lwz/g0;Lxz/x;Lkotlin/jvm/functions/Function1;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    const-string v5, "linkConfiguration"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "linkAccountManager"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "dismissWithResult"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Landroidx/lifecycle/w1;-><init>()V

    iput-object v1, v0, Ll00/i;->w:Ld00/l;

    iput-object v3, v0, Ll00/i;->x:Lxz/x;

    iput-object v4, v0, Ll00/i;->y:Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Ld00/l;->z:Ld00/m;

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    iget-object v3, v3, Ld00/m;->x:Ld00/k;

    goto :goto_0

    :cond_0
    move-object v3, v5

    :goto_0
    instance-of v6, v3, Ld00/h;

    if-eqz v6, :cond_1

    check-cast v3, Ld00/h;

    goto :goto_1

    :cond_1
    move-object v3, v5

    :goto_1
    if-eqz v3, :cond_2

    iget-object v3, v3, Ld00/h;->w:Lcom/stripe/android/model/ConsentUi$ConsentPane;

    move-object v10, v3

    goto :goto_2

    :cond_2
    move-object v10, v5

    :goto_2
    iget-object v7, v2, Lwz/g0;->x:Ljava/lang/String;

    iget-object v9, v2, Lwz/g0;->E:Ljava/lang/String;

    iget-object v8, v1, Ld00/l;->H:Ljava/lang/String;

    new-instance v6, Ll00/j;

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v11}, Ll00/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConsentUi$ConsentPane;Lzy/c;)V

    invoke-static {v6}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, v0, Ll00/i;->z:Lec3/h2;

    iput-object v2, v0, Ll00/i;->E:Lec3/h2;

    if-nez v10, :cond_3

    new-instance v11, Lwz/n;

    new-instance v12, Lwz/d;

    invoke-direct {v12, v1, v5}, Lwz/d;-><init>(Ld00/l;Lwz/c;)V

    const/4 v15, 0x0

    const/16 v16, 0xe

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v11 .. v16}, Lwz/n;-><init>(Lwz/e;Lwz/u0;Ly00/j0;Ljava/lang/Boolean;I)V

    invoke-interface {v4, v11}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method
