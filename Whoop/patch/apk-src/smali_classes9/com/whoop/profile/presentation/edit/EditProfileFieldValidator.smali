.class public final Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0008\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000c\u0010\u0008J\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u000e\u0010\u0008J\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0008J%\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001d\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0004\u00a2\u0006\u0004\u0008 \u0010\u0008J\u0015\u0010!\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008!\u0010\"J\u0015\u0010#\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u0004\u00a2\u0006\u0004\u0008#\u0010\"J\u0015\u0010%\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u0004\u00a2\u0006\u0004\u0008%\u0010\"J%\u0010&\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008&\u0010\'J%\u0010(\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008(\u0010\'R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u0014\u0010/\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008/\u0010.R\u0014\u00100\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010+R\u0014\u00101\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00081\u0010.R\u0014\u00102\u001a\u00020,8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u00082\u0010.R\u0014\u00103\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010+\u00a8\u00064"
    }
    d2 = {
        "Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;",
        "",
        "<init>",
        "()V",
        "",
        "email",
        "Lcom/whoop/design/util/TextResource;",
        "validateEmail",
        "(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;",
        "username",
        "validateUsername",
        "firstName",
        "validateFirstName",
        "lastName",
        "validateLastName",
        "city",
        "validateCity",
        "",
        "heightValue",
        "",
        "isImperial",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;",
        "validationRanges",
        "validateHeight",
        "(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;",
        "weightValue",
        "validateWeight",
        "(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;",
        "feetValue",
        "validateFeet",
        "(Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;",
        "inchesValue",
        "validateInches",
        "isEmailValid",
        "(Ljava/lang/String;)Z",
        "isUsernameValid",
        "name",
        "isNameValid",
        "isHeightValid",
        "(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Z",
        "isWeightValid",
        "Lyb3/p;",
        "EMAIL_PATTERN",
        "Lyb3/p;",
        "",
        "USERNAME_MIN_LENGTH",
        "I",
        "USERNAME_MAX_LENGTH",
        "USERNAME_PATTERN",
        "NAME_MIN_LENGTH",
        "NAME_MAX_LENGTH",
        "NAME_PATTERN",
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
.field public static final $stable:I

.field private static final EMAIL_PATTERN:Lyb3/p;

.field public static final INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

.field private static final NAME_MAX_LENGTH:I = 0x32

.field private static final NAME_MIN_LENGTH:I = 0x1

.field private static final NAME_PATTERN:Lyb3/p;

.field private static final USERNAME_MAX_LENGTH:I = 0x1e

.field private static final USERNAME_MIN_LENGTH:I = 0x3

.field private static final USERNAME_PATTERN:Lyb3/p;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-direct {v0}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;-><init>()V

    sput-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    new-instance v0, Lyb3/p;

    const-string v1, "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->EMAIL_PATTERN:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "^[a-zA-Z0-9_]+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->USERNAME_PATTERN:Lyb3/p;

    new-instance v0, Lyb3/p;

    const-string v1, "^[\\p{L}\\s\'-]+$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->NAME_PATTERN:Lyb3/p;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final isEmailValid(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->EMAIL_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isHeightValid(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Z
    .locals 1

    const-string v0, "heightValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationRanges"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateHeight(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isNameValid(Ljava/lang/String;)Z
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-gt v1, v0, :cond_0

    const/16 v2, 0x33

    if-ge v0, v2, :cond_0

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->NAME_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isUsernameValid(Ljava/lang/String;)Z
    .locals 2

    const-string v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-gt v1, v0, :cond_0

    const/16 v1, 0x1f

    if-ge v0, v1, :cond_0

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->USERNAME_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final isWeightValid(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Z
    .locals 1

    const-string v0, "weightValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationRanges"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateWeight(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    return p1
.end method

.method public final validateCity(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 2

    const-string v0, "city"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_city_too_short:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    if-le v0, v1, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_city_too_long:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->NAME_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_city_invalid_characters:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method public final validateEmail(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_email_required:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->EMAIL_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_1

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_email_invalid:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method public final validateFeet(Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;
    .locals 2

    const-string v0, "feetValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationRanges"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_feet_required:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightFeetMin()I

    move-result v1

    if-ge v0, v1, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_feet_too_short:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightFeetMax()I

    move-result p2

    if-le p1, p2, :cond_3

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_feet_too_tall:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_4
    :goto_0
    sget p1, Lcom/whoop/profile/R$string;->profile_edit_feet_invalid:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1
.end method

.method public final validateFirstName(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 2

    const-string v0, "firstName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_first_name_required:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_first_name_too_short:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    if-le v0, v1, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_first_name_too_long:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->NAME_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_name_invalid_characters:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method public final validateHeight(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;
    .locals 2

    const-string v0, "validationRanges"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gtz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_height_invalid:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    if-eqz p2, :cond_1

    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightFeetMin()I

    move-result v0

    const/4 v1, 0x0

    invoke-virtual {p2, v0, v1}, Ld21/a;->c(II)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightFeetMax()I

    move-result p3

    const/16 v1, 0xb

    invoke-virtual {p2, p3, v1}, Ld21/a;->c(II)F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    new-instance p3, Ll83/k;

    invoke-direct {p3, v0, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightMetersMin()F

    move-result p2

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getHeightMetersMax()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    new-instance v0, Ll83/k;

    invoke-direct {v0, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object p3, v0

    :goto_0
    iget-object p2, p3, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    move-result p2

    iget-object p3, p3, Ll83/k;->x:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Number;

    invoke-virtual {p3}, Ljava/lang/Number;->floatValue()F

    move-result p3

    cmpg-float p2, p1, p2

    if-gez p2, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_height_too_short:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    cmpl-float p1, p1, p3

    if-lez p1, :cond_3

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_height_too_tall:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method public final validateInches(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 1

    const-string v0, "inchesValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_inches_required:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    const/16 v0, 0xc

    if-lt p1, v0, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_inches_too_many:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_3
    :goto_0
    sget p1, Lcom/whoop/profile/R$string;->profile_edit_inches_invalid:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1
.end method

.method public final validateLastName(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 2

    const-string v0, "lastName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_last_name_required:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_last_name_too_short:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x32

    if-le v0, v1, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_last_name_too_long:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->NAME_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_name_invalid_characters:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method public final validateUsername(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 2

    const-string v0, "username"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_username_required:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/4 v1, 0x3

    if-ge v0, v1, :cond_1

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_username_too_short:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x1e

    if-le v0, v1, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_username_too_long:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->USERNAME_PATTERN:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_3

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_username_invalid_characters:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method

.method public final validateWeight(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;
    .locals 1

    const-string v0, "weightValue"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "validationRanges"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_weight_required:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-gtz v0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p2, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightPoundsMin()I

    move-result v0

    if-ge p2, v0, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_weight_too_light:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightPoundsMax()I

    move-result p2

    if-le p1, p2, :cond_3

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_weight_too_heavy:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p2

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightKilogramsMin()I

    move-result v0

    if-ge p2, v0, :cond_5

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_weight_too_light:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_5
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;->getWeightKilogramsMax()I

    move-result p2

    if-le p1, p2, :cond_6

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_weight_too_heavy:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_6
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_7
    :goto_0
    sget p1, Lcom/whoop/profile/R$string;->profile_edit_weight_invalid:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1
.end method
