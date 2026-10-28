.class public final synthetic Lk03/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public final synthetic E:F

.field public final synthetic F:Z

.field public final synthetic G:Ljava/lang/String;

.field public final synthetic H:Ljava/lang/String;

.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/String;

.field public final synthetic y:J

.field public final synthetic z:I


# direct methods
.method public synthetic constructor <init>(FIIJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    iput p3, p0, Lk03/g;->w:I

    iput-object p6, p0, Lk03/g;->x:Ljava/lang/String;

    iput-wide p4, p0, Lk03/g;->y:J

    iput p2, p0, Lk03/g;->z:I

    iput p1, p0, Lk03/g;->E:F

    iput-boolean p9, p0, Lk03/g;->F:Z

    iput-object p7, p0, Lk03/g;->G:Ljava/lang/String;

    iput-object p8, p0, Lk03/g;->H:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;JILjava/lang/String;FZLjava/lang/String;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lk03/g;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk03/g;->x:Ljava/lang/String;

    iput-wide p2, p0, Lk03/g;->y:J

    iput p4, p0, Lk03/g;->z:I

    iput-object p5, p0, Lk03/g;->G:Ljava/lang/String;

    iput p6, p0, Lk03/g;->E:F

    iput-boolean p7, p0, Lk03/g;->F:Z

    iput-object p8, p0, Lk03/g;->H:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lk03/g;->w:I

    packed-switch v0, :pswitch_data_0

    move-object v9, p1

    check-cast v9, Lv6/g;

    move-object v10, p2

    check-cast v10, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    iget-object v1, p0, Lk03/g;->x:Ljava/lang/String;

    iget-wide v2, p0, Lk03/g;->y:J

    iget v4, p0, Lk03/g;->z:I

    iget v5, p0, Lk03/g;->E:F

    iget-boolean v6, p0, Lk03/g;->F:Z

    iget-object v7, p0, Lk03/g;->G:Ljava/lang/String;

    iget-object v8, p0, Lk03/g;->H:Ljava/lang/String;

    invoke-static/range {v1 .. v11}, Lk03/n;->m(Ljava/lang/String;JIFZLjava/lang/String;Ljava/lang/String;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_0
    move-object v8, p1

    check-cast v8, Lv6/g;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lk03/g;->x:Ljava/lang/String;

    iget-wide v1, p0, Lk03/g;->y:J

    iget v3, p0, Lk03/g;->z:I

    iget v4, p0, Lk03/g;->E:F

    iget-boolean v5, p0, Lk03/g;->F:Z

    iget-object v6, p0, Lk03/g;->G:Ljava/lang/String;

    iget-object v7, p0, Lk03/g;->H:Ljava/lang/String;

    invoke-static/range {v0 .. v10}, Lk03/n;->g(Ljava/lang/String;JIFZLjava/lang/String;Ljava/lang/String;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_1
    move-object v8, p1

    check-cast v8, Lv6/g;

    move-object v9, p2

    check-cast v9, Landroidx/compose/runtime/Composer;

    check-cast p3, Ljava/lang/Integer;

    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    move-result v10

    iget-object v0, p0, Lk03/g;->x:Ljava/lang/String;

    iget-wide v1, p0, Lk03/g;->y:J

    iget v3, p0, Lk03/g;->z:I

    iget v4, p0, Lk03/g;->E:F

    iget-boolean v5, p0, Lk03/g;->F:Z

    iget-object v6, p0, Lk03/g;->G:Ljava/lang/String;

    iget-object v7, p0, Lk03/g;->H:Ljava/lang/String;

    invoke-static/range {v0 .. v10}, Lk03/n;->l(Ljava/lang/String;JIFZLjava/lang/String;Ljava/lang/String;Lv6/g;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
