.class public final synthetic Ljs1/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public final synthetic x:Z

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lhs1/c;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput v0, p0, Ljs1/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljs1/i;->z:Ljava/lang/Object;

    iput-object p2, p0, Ljs1/i;->y:Ljava/lang/Object;

    iput-boolean p3, p0, Ljs1/i;->x:Z

    iput-object p4, p0, Ljs1/i;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lk01/e;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)V
    .locals 1

    .line 2
    const/4 v0, 0x1

    iput v0, p0, Ljs1/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ljs1/i;->z:Ljava/lang/Object;

    iput-object p2, p0, Ljs1/i;->E:Ljava/lang/Object;

    iput-boolean p3, p0, Ljs1/i;->x:Z

    iput-object p4, p0, Ljs1/i;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    .line 3
    const/4 v0, 0x2

    iput v0, p0, Ljs1/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ljs1/i;->x:Z

    iput-object p2, p0, Ljs1/i;->z:Ljava/lang/Object;

    iput-object p3, p0, Ljs1/i;->y:Ljava/lang/Object;

    iput-object p4, p0, Ljs1/i;->E:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(ZLny0/v;Ljava/lang/String;Li2/t;)V
    .locals 1

    .line 4
    const/4 v0, 0x3

    iput v0, p0, Ljs1/i;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ljs1/i;->x:Z

    iput-object p2, p0, Ljs1/i;->z:Ljava/lang/Object;

    iput-object p3, p0, Ljs1/i;->E:Ljava/lang/Object;

    iput-object p4, p0, Ljs1/i;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget v0, p0, Ljs1/i;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ljs1/i;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lny0/v;

    iget-object v0, p0, Ljs1/i;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, p0, Ljs1/i;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Li2/t;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v1, p0, Ljs1/i;->x:Z

    invoke-static/range {v1 .. v6}, Lny0/u;->c(ZLny0/v;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, Ljs1/i;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lcom/whoop/design/util/TextResource;

    iget-object v0, p0, Ljs1/i;->y:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lb91/a;

    iget-object v0, p0, Ljs1/i;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lcom/whoop/design/util/TextResource;

    move-object v5, p1

    check-cast v5, Ly2/v1;

    move-object v6, p2

    check-cast v6, Ly3/a;

    iget-boolean v1, p0, Ljs1/i;->x:Z

    invoke-static/range {v1 .. v6}, Lly0/e;->c(ZLcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Ly2/v1;Ly3/a;)Ly2/s0;

    move-result-object p1

    return-object p1

    :pswitch_1
    iget-object v0, p0, Ljs1/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lk01/e;

    iget-object v0, p0, Ljs1/i;->E:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Landroidx/compose/ui/Modifier;

    iget-object v0, p0, Ljs1/i;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v3, p0, Ljs1/i;->x:Z

    invoke-static/range {v1 .. v6}, Lk01/d;->d(Lk01/e;Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_2
    iget-object v0, p0, Ljs1/i;->z:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lhs1/c;

    iget-object v0, p0, Ljs1/i;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Ljs1/i;->E:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    move-object v5, p1

    check-cast v5, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v6

    iget-boolean v3, p0, Ljs1/i;->x:Z

    invoke-static/range {v1 .. v6}, Ljs1/l;->h(Lhs1/c;Lkotlin/jvm/functions/Function1;ZLjava/lang/String;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
