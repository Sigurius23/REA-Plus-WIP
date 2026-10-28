.class public final synthetic Lui0/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/p;


# instance fields
.field public final synthetic w:Lri0/e;

.field public final synthetic x:Liy1/c;

.field public final synthetic y:Lkotlin/jvm/functions/Function1;


# direct methods
.method public synthetic constructor <init>(Lri0/e;Liy1/c;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lui0/m;->w:Lri0/e;

    iput-object p2, p0, Lui0/m;->x:Liy1/c;

    iput-object p3, p0, Lui0/m;->y:Lkotlin/jvm/functions/Function1;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    move-object v3, p1

    check-cast v3, Lcom/whoop/design/models/modal/FullScreenContentModal;

    move-object v4, p2

    check-cast v4, Lcom/whoop/design/models/modal/ModalAnalyticEventModel;

    move-object v5, p3

    check-cast v5, Lfi0/a;

    move-object v6, p4

    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v7, p5

    check-cast v7, Landroidx/compose/runtime/Composer;

    check-cast p6, Ljava/lang/Integer;

    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    move-result v8

    iget-object v0, p0, Lui0/m;->w:Lri0/e;

    iget-object v1, p0, Lui0/m;->x:Liy1/c;

    iget-object v2, p0, Lui0/m;->y:Lkotlin/jvm/functions/Function1;

    invoke-static/range {v0 .. v8}, Lui0/n;->e(Lri0/e;Liy1/c;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/models/modal/FullScreenContentModal;Lcom/whoop/design/models/modal/ModalAnalyticEventModel;Lfi0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p1

    return-object p1
.end method
