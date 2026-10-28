.class public final Lcom/whoop/profile/view/edit/CountryStateSheetState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J1\u0010\u0013\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0014\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u0017\u001a\u00020\u0018H\u00d6\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aH\u00d6\u0081\u0004R\u0017\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001b"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/CountryStateSheetState;",
        "",
        "countries",
        "",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
        "selectedCountry",
        "selectedState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;",
        "<init>",
        "(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)V",
        "getCountries",
        "()Ljava/util/List;",
        "getSelectedCountry",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
        "getSelectedState",
        "()Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final countries:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ">;"
        }
    .end annotation
.end field

.field private final selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

.field private final selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/profile/view/edit/CountryStateSheetState;-><init>(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ">;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;",
            ")V"
        }
    .end annotation

    const-string v0, "countries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    .line 4
    iput-object p2, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    .line 5
    iput-object p3, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    .line 6
    sget-object p1, Lm83/y;->w:Lm83/y;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    move-object p3, v0

    .line 7
    :cond_2
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/CountryStateSheetState;-><init>(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/CountryStateSheetState;Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/CountryStateSheetState;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/CountryStateSheetState;->copy(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)Lcom/whoop/profile/view/edit/CountryStateSheetState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    return-object v0
.end method

.method public final component2()Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    return-object v0
.end method

.method public final component3()Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    return-object v0
.end method

.method public final copy(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)Lcom/whoop/profile/view/edit/CountryStateSheetState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ">;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;",
            ")",
            "Lcom/whoop/profile/view/edit/CountryStateSheetState;"
        }
    .end annotation

    const-string v0, "countries"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/profile/view/edit/CountryStateSheetState;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/profile/view/edit/CountryStateSheetState;-><init>(Ljava/util/List;Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/CountryStateSheetState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/CountryStateSheetState;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    iget-object p1, p1, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCountries()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    return-object v0
.end method

.method public final getSelectedCountry()Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    return-object v0
.end method

.method public final getSelectedState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->countries:Ljava/util/List;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedCountry:Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/CountryStateSheetState;->selectedState:Lcom/whoop/profile/presentation/edit/EditProfileViewState$State;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "CountryStateSheetState(countries="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedCountry="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selectedState="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
