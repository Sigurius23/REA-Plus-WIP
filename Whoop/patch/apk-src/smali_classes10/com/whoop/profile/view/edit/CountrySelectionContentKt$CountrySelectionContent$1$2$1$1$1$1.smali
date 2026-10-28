.class final Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


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
        "Lc93/a;"
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
.field final synthetic $country:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

.field final synthetic $onCountrySelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;->$onCountrySelected:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;->$country:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;->invoke()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public final invoke()V
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;->$onCountrySelected:Lkotlin/jvm/functions/Function1;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/CountrySelectionContentKt$CountrySelectionContent$1$2$1$1$1$1;->$country:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
