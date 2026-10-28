.class public final Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/profile/view/edit/CountrySelectionContentKt;->CountrySelectionContent(Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic $items:Ljava/util/List;

.field final synthetic $key:Lc93/m;


# direct methods
.method public constructor <init>(Lc93/m;Ljava/util/List;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$1;->$key:Lc93/m;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$1;->$items:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(I)Ljava/lang/Object;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$1;->$key:Lc93/m;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$1;->$items:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v0, v1, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$lambda$7$1$0$$inlined$itemsIndexed$default$1;->invoke(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
