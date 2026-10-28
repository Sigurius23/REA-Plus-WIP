.class public final Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;,
        Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;,
        Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u00c7\u0002\u0018\u00002\u00020\u0001:\u000256B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J*\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\nJ\u001e\u0010\u000c\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0008J\u0016\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0008J4\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00082\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\nJ;\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bJ(\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u001e\u001a\u00020\u000b2\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u0008J\u0016\u0010 \u001a\u00020\u000b2\u0006\u0010!\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u000bJ\u0016\u0010#\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00082\u0006\u0010\u001d\u001a\u00020\u0008J(\u0010$\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010%\u001a\u00020&2\u0006\u0010\u001e\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\'\u001a\u00020(J\u0016\u0010)\u001a\u00020*2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000eJ4\u0010+\u001a\u00020,2\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u000b0\nJ;\u0010-\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00052\u0008\u0010\u001f\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0002\u0010\u001bJ,\u0010.\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010/\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*00H\u0002J.\u00101\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00082\n\u0008\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\u0008\u0002\u00102\u001a\u0004\u0018\u00010\u0008J$\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\u00082\u0008\u00102\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002\u00a8\u00067"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;",
        "",
        "<init>",
        "()V",
        "updateEmailField",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "formState",
        "newValue",
        "",
        "emailValidationCache",
        "",
        "",
        "updateNonEmailField",
        "fieldType",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;",
        "updateUsernameField",
        "updateFieldValue",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;",
        "currentFormState",
        "value",
        "applyEmailValidationResult",
        "lastValidatedEmail",
        "isValid",
        "validationError",
        "Lcom/whoop/design/util/TextResource;",
        "profileData",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
        "(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "handleUsernameFieldBlur",
        "originalUsername",
        "showUsernameField",
        "lastValidatedUsername",
        "isUsernameFieldValidating",
        "formStateUsernameValidating",
        "viewStateUsernameValidating",
        "shouldTriggerUsernameValidation",
        "isSaveButtonEnabled",
        "editableFields",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;",
        "usernameValidationState",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;",
        "getFieldByType",
        "Lcom/whoop/profile/view/edit/form/FieldState;",
        "handleEmailValidation",
        "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;",
        "applyUsernameValidationResult",
        "updateField",
        "transform",
        "Lkotlin/Function1;",
        "validateField",
        "countryCode",
        "validateStateField",
        "state",
        "EmailValidationResult",
        "UpdateFieldValueResult",
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

.field public static final INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;

    invoke-direct {v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;-><init>()V

    sput-object v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->INSTANCE:Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateEmailField$lambda$1(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final applyEmailValidationResult$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final applyUsernameValidationResult$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleEmailValidation$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleUsernameFieldBlur$lambda$2(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateUsernameField$lambda$0(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleUsernameFieldBlur$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleEmailValidation$lambda$1(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->applyEmailValidationResult$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateNonEmailField$lambda$0(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final handleEmailValidation$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final handleEmailValidation$lambda$1(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x1

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final handleEmailValidation$lambda$2(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final handleUsernameFieldBlur$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final handleUsernameFieldBlur$lambda$1(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x17

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final handleUsernameFieldBlur$lambda$2(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v8, 0x15

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->applyUsernameValidationResult$lambda$0(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic isSaveButtonEnabled$default(Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;ILjava/lang/Object;)Z
    .locals 8

    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_0

    new-instance v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;

    const/16 v6, 0x1f

    const/4 v7, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v7}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;-><init>(ZLjava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p4, v0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->isSaveButtonEnabled(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;)Z

    move-result p0

    return p0
.end method

.method public static synthetic j(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleEmailValidation$lambda$2(Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->handleUsernameFieldBlur$lambda$1(Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final updateEmailField$lambda$0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method

.method private static final updateEmailField$lambda$1(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private final updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;"
        }
    .end annotation

    move-object/from16 v0, p3

    sget-object v1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual/range {p2 .. p2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCity()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v14, v0

    check-cast v14, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0xfff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_1
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getBirthday()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v13, v0

    check-cast v13, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x17ff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_2
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v12, v0

    check-cast v12, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1bff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_3
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCountry()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1dff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_4
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1eff

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_5
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getGender()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1f7f

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_6
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUnitSystem()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1fbf

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_7
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getWeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1fdf

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_8
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getHeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1fef

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_9
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getLastName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1ff7

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getFirstName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v4, v0

    check-cast v4, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1ffb

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_b
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v3, v0

    check-cast v3, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1ffd

    const/16 v16, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    :pswitch_c
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getEmail()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v1

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/whoop/profile/view/edit/form/FieldState;

    const/16 v15, 0x1ffe

    const/16 v16, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v16}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private static final updateNonEmailField$lambda$0(Ljava/lang/String;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v8, 0x2e

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p0

    move-object v1, p1

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method private static final updateUsernameField$lambda$0(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 10

    const-string v0, "field"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x4

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v1, p2

    invoke-static/range {v1 .. v9}, Lcom/whoop/profile/view/edit/form/FieldState;->copy$default(Lcom/whoop/profile/view/edit/form/FieldState;Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZZZZILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic validateField$default(Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/design/util/TextResource;
    .locals 1

    and-int/lit8 p6, p5, 0x4

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p3, v0

    :cond_0
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_1

    move-object p4, v0

    :cond_1
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->validateField(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p0

    return-object p0
.end method

.method private final validateStateField(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;)Lcom/whoop/design/util/TextResource;
    .locals 2

    if-eqz p3, :cond_3

    if-eqz p2, :cond_3

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getCountries()Ljava/util/List;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    invoke-virtual {v1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getCountryCode()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$Country;->getStates()Ljava/util/List;

    move-result-object p2

    if-eqz p2, :cond_2

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    move-result p2

    const/4 p3, 0x1

    xor-int/2addr p2, p3

    if-ne p2, p3, :cond_2

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget p1, Lcom/whoop/profile/R$string;->profile_edit_state_required_for_selected_country:I

    invoke-static {p1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final applyEmailValidationResult(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 2

    const-string v0, "currentFormState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getEmail()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getEmail()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getHasBeenInteractedWith()Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    sget-object p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->EMAIL:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getEmail()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p2, v0, p5, v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->validateField(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p5

    invoke-static {p5}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result p5

    if-eqz p5, :cond_2

    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p4

    goto :goto_0

    :cond_0
    if-nez p4, :cond_1

    sget p3, Lcom/whoop/profile/R$string;->profile_edit_email_cannot_be_used:I

    invoke-static {p3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p4

    :cond_1
    :goto_0
    new-instance p3, Lcom/whoop/profile/view/edit/form/a;

    const/4 p5, 0x1

    invoke-direct {p3, p4, p5}, Lcom/whoop/profile/view/edit/form/a;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final applyUsernameValidationResult(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/design/util/TextResource;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 2

    const-string v0, "currentFormState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getHasBeenInteractedWith()Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p3, :cond_2

    sget-object p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, p2, v0, p5, v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->validateField(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p5

    invoke-static {p5}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result p5

    if-eqz p5, :cond_2

    sget-object p5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p3, p5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p4

    goto :goto_0

    :cond_0
    if-nez p4, :cond_1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p4

    :cond_1
    :goto_0
    new-instance p3, Lcom/whoop/profile/view/edit/form/a;

    const/4 p5, 0x0

    invoke-direct {p3, p4, p5}, Lcom/whoop/profile/view/edit/form/a;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    :cond_2
    return-object p1
.end method

.method public final getFieldByType(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v0, p2

    packed-switch p2, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCity()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getBirthday()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getState()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_3
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCountry()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getGender()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUnitSystem()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getWeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getHeight()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getLastName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_a
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getFirstName()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_b
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getEmail()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final handleEmailValidation(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/util/Map;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;",
            "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;"
        }
    .end annotation

    const-string v0, "currentFormState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidationCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->getFieldByType(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getCountry()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, p2, v1, p3, v2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->validateField(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p3

    sget-object v1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->EMAIL:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-ne p2, v1, :cond_2

    invoke-static {p3}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getHasBeenInteractedWith()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p4, p3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p4, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    sget-object p4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p3, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    goto :goto_0

    :cond_0
    sget p3, Lcom/whoop/profile/R$string;->profile_edit_email_cannot_be_used:I

    invoke-static {p3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object p3

    :goto_0
    new-instance p4, Lcom/whoop/profile/view/edit/form/a;

    const/4 v0, 0x2

    invoke-direct {p4, p3, v0}, Lcom/whoop/profile/view/edit/form/a;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-direct {p0, p1, p2, p4}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v2

    new-instance v1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1

    :cond_1
    new-instance p4, Lcom/whoop/data/local/room/dao/persistent/i;

    const/16 v0, 0x1d

    invoke-direct {p4, v0}, Lcom/whoop/data/local/room/dao/persistent/i;-><init>(I)V

    invoke-direct {p0, p1, p2, p4}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    new-instance p2, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    const/4 p4, 0x1

    invoke-direct {p2, p1, p4, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;)V

    return-object p2

    :cond_2
    new-instance p4, Lcom/whoop/profile/view/edit/form/a;

    const/4 v0, 0x3

    invoke-direct {p4, p3, v0}, Lcom/whoop/profile/view/edit/form/a;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-direct {p0, p1, p2, p4}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object v2

    new-instance v1, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$EmailValidationResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final handleUsernameFieldBlur(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;ZLjava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 3

    const-string v0, "currentFormState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalUsername"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    sget-object v1, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateUsername(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-eqz p3, :cond_0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    const/4 p2, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    invoke-static {v1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p3

    if-eqz p3, :cond_1

    sget-object p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    new-instance p3, Lcom/whoop/profile/view/edit/form/a;

    const/4 p4, 0x4

    invoke-direct {p3, v1, p4}, Lcom/whoop/profile/view/edit/form/a;-><init>(Lcom/whoop/design/util/TextResource;I)V

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz p2, :cond_3

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p2

    if-nez p2, :cond_2

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-static {p4, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    :cond_2
    sget-object p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    new-instance p3, Lcom/whoop/profile/view/edit/form/c;

    const/4 p4, 0x0

    invoke-direct {p3, p4}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    return-object p1

    :cond_3
    sget-object p2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    new-instance p3, Lcom/whoop/profile/view/edit/form/c;

    const/4 p4, 0x1

    invoke-direct {p3, p4}, Lcom/whoop/profile/view/edit/form/c;-><init>(I)V

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    return-object p1
.end method

.method public final isSaveButtonEnabled(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;)Z
    .locals 4

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "editableFields"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "usernameValidationState"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->anyFieldValidating()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    const/4 v0, 0x1

    if-eqz p3, :cond_3

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_3

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating()Z

    move-result p3

    invoke-virtual {p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->isValid()Ljava/lang/Boolean;

    move-result-object v2

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {p4}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$UsernameValidationViewState;->getLastValidatedUsername()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->getUsername()Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-eqz p4, :cond_1

    move p4, v0

    goto :goto_0

    :cond_1
    move p4, v1

    :goto_0
    if-nez p3, :cond_2

    invoke-static {p2}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result p2

    if-eqz p2, :cond_2

    if-eqz p4, :cond_2

    invoke-virtual {p1, v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->hasErrors(Z)Z

    move-result p1

    if-nez p1, :cond_2

    return v0

    :cond_2
    return v1

    :cond_3
    invoke-virtual {p1, p2, v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->isAnyFieldDirty(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Z)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-virtual {p1, v1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->hasErrors(Z)Z

    move-result p1

    if-nez p1, :cond_4

    return v0

    :cond_4
    return v1
.end method

.method public final isUsernameFieldValidating(ZZ)Z
    .locals 0

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method public final shouldTriggerUsernameValidation(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    const-string v0, "value"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "originalUsername"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {v0, p1}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateUsername(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    invoke-static {v0}, Lcom/whoop/design/util/b;->c(Lcom/whoop/design/util/TextResource;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final updateEmailField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;"
        }
    .end annotation

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidationCache"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object p3

    check-cast p3, Ljava/lang/Iterable;

    const-string v0, "<this>"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :cond_0
    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p2, v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateEmailField$lambda$0(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    :cond_1
    sget-object p3, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->EMAIL:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    new-instance v0, Lb30/y4;

    const/16 v1, 0xa

    invoke-direct {v0, p2, v1}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-direct {p0, p1, p3, v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    return-object p1
.end method

.method public final updateFieldValue(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
            "Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;)",
            "Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;"
        }
    .end annotation

    const-string v0, "currentFormState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "emailValidationCache"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->getFieldByType(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;)Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->EMAIL:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-ne p2, v0, :cond_0

    invoke-virtual {p0, p1, p3, p4}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateEmailField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;Ljava/util/Map;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    goto :goto_0

    :cond_0
    sget-object p4, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-ne p2, p4, :cond_1

    invoke-virtual {p0, p1, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateUsernameField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateNonEmailField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    :goto_0
    sget-object p3, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->COUNTRY:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-eq p2, p3, :cond_3

    sget-object p3, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->STATE:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    if-ne p2, p3, :cond_2

    goto :goto_1

    :cond_2
    const/4 p2, 0x0

    goto :goto_2

    :cond_3
    :goto_1
    const/4 p2, 0x1

    :goto_2
    new-instance p3, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;

    invoke-direct {p3, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$UpdateFieldValueResult;-><init>(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Z)V

    return-object p3

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final updateNonEmailField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 2

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fieldType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newValue"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb30/y4;

    const/16 v1, 0x9

    invoke-direct {v0, p3, v1}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-direct {p0, p1, p2, v0}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    return-object p1
.end method

.method public final updateUsernameField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Ljava/lang/String;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 4

    const-string v0, "formState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {v0, p2}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateUsername(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v1, Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;->USERNAME:Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;

    new-instance v2, Lcom/whoop/profile/view/edit/form/b;

    const/4 v3, 0x0

    invoke-direct {v2, p2, v0, v3}, Lcom/whoop/profile/view/edit/form/b;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;I)V

    invoke-direct {p0, p1, v1, v2}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->updateField(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Lkotlin/jvm/functions/Function1;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p1

    return-object p1
.end method

.method public final validateField(Lcom/whoop/profile/presentation/edit/EditProfileEvent$FieldType;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;
    .locals 1

    const-string v0, "fieldType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "value"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateCity(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-direct {p0, p2, p4, p3}, Lcom/whoop/profile/view/edit/form/EditProfileFormUtils;->validateStateField(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_3
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p1

    invoke-static {p2}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :cond_0
    if-eqz p1, :cond_1

    sget-object p2, Ld21/a;->a:Ld21/a;

    invoke-virtual {p2, v0}, Ld21/a;->m(F)I

    move-result p2

    goto :goto_0

    :cond_1
    invoke-static {v0}, Le93/b;->X(F)I

    move-result p2

    :goto_0
    sget-object p4, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-static {p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getValidationRanges()Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    move-result-object p3

    invoke-virtual {p4, p2, p1, p3}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateWeight(Ljava/lang/String;ZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_4
    if-eqz p3, :cond_4

    invoke-static {p2}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    :cond_3
    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getUnitSystem()Lcom/whoop/domain/model/UnitSystem;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/domain/model/UnitSystemExtKt;->isImperial(Lcom/whoop/domain/model/UnitSystem;)Z

    move-result p2

    invoke-virtual {p3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditProfileData;->getValidationRanges()Lcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;

    move-result-object p3

    invoke-virtual {p1, v0, p2, p3}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateHeight(FZLcom/whoop/profile/presentation/edit/EditProfileViewState$ValidationRanges;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_5
    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateLastName(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_6
    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateFirstName(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_7
    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateUsername(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_8
    sget-object p1, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->INSTANCE:Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;

    invoke-virtual {p1, p2}, Lcom/whoop/profile/presentation/edit/EditProfileFieldValidator;->validateEmail(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_2
        :pswitch_0
    .end packed-switch
.end method
