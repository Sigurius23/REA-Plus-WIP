.class public final Lcom/whoop/profile/view/edit/form/EditProfileFormState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0008\u0008\u0002\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\u0010\u0010&\u001a\u00020!2\u0008\u0008\u0002\u0010$\u001a\u00020!J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0003H\u00c6\u0003J\t\u0010.\u001a\u00020\u0003H\u00c6\u0003J\t\u0010/\u001a\u00020\u0003H\u00c6\u0003J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\u0003H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\u008b\u0001\u00104\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\u00032\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u0003H\u00c6\u0001J\u0014\u00105\u001a\u00020!2\u0008\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u00107\u001a\u000208H\u00d6\u0081\u0004J\n\u00109\u001a\u00020:H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0013R\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0013R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0013R\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0013\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/form/EditProfileFormState;",
        "",
        "email",
        "Lcom/whoop/profile/view/edit/form/FieldState;",
        "username",
        "firstName",
        "lastName",
        "height",
        "weight",
        "unitSystem",
        "gender",
        "physiologicalBaseline",
        "country",
        "state",
        "birthday",
        "city",
        "<init>",
        "(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)V",
        "getEmail",
        "()Lcom/whoop/profile/view/edit/form/FieldState;",
        "getUsername",
        "getFirstName",
        "getLastName",
        "getHeight",
        "getWeight",
        "getUnitSystem",
        "getGender",
        "getPhysiologicalBaseline",
        "getCountry",
        "getState",
        "getBirthday",
        "getCity",
        "isAnyFieldDirty",
        "",
        "original",
        "Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;",
        "includeUsername",
        "anyFieldValidating",
        "hasErrors",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "copy",
        "equals",
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
.field public static final $stable:I


# instance fields
.field private final birthday:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final city:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final country:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final email:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final firstName:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final gender:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final height:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final lastName:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final state:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final username:Lcom/whoop/profile/view/edit/form/FieldState;

.field private final weight:Lcom/whoop/profile/view/edit/form/FieldState;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)V
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstName"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weight"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "physiologicalBaseline"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birthday"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "city"

    invoke-static {p13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p3, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p4, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p5, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p6, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p7, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p8, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p9, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p10, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p11, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p12, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    iput-object p13, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;ILjava/lang/Object;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 12

    move/from16 v0, p14

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_1

    :cond_2
    move-object v2, p3

    :goto_1
    and-int/lit8 v3, v0, 0x8

    if-eqz v3, :cond_3

    iget-object v3, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_2

    :cond_3
    move-object/from16 v3, p4

    :goto_2
    and-int/lit8 v4, v0, 0x10

    if-eqz v4, :cond_4

    iget-object v4, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_3

    :cond_4
    move-object/from16 v4, p5

    :goto_3
    and-int/lit8 v5, v0, 0x20

    if-eqz v5, :cond_5

    iget-object v5, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_4

    :cond_5
    move-object/from16 v5, p6

    :goto_4
    and-int/lit8 v6, v0, 0x40

    if-eqz v6, :cond_6

    iget-object v6, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_5

    :cond_6
    move-object/from16 v6, p7

    :goto_5
    and-int/lit16 v7, v0, 0x80

    if-eqz v7, :cond_7

    iget-object v7, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_6

    :cond_7
    move-object/from16 v7, p8

    :goto_6
    and-int/lit16 v8, v0, 0x100

    if-eqz v8, :cond_8

    iget-object v8, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_7

    :cond_8
    move-object/from16 v8, p9

    :goto_7
    and-int/lit16 v9, v0, 0x200

    if-eqz v9, :cond_9

    iget-object v9, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_8

    :cond_9
    move-object/from16 v9, p10

    :goto_8
    and-int/lit16 v10, v0, 0x400

    if-eqz v10, :cond_a

    iget-object v10, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_9

    :cond_a
    move-object/from16 v10, p11

    :goto_9
    and-int/lit16 v11, v0, 0x800

    if-eqz v11, :cond_b

    iget-object v11, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    goto :goto_a

    :cond_b
    move-object/from16 v11, p12

    :goto_a
    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    move-object/from16 p15, v0

    :goto_b
    move-object p2, p0

    move-object p3, p1

    move-object/from16 p4, v1

    move-object/from16 p5, v2

    move-object/from16 p6, v3

    move-object/from16 p7, v4

    move-object/from16 p8, v5

    move-object/from16 p9, v6

    move-object/from16 p10, v7

    move-object/from16 p11, v8

    move-object/from16 p12, v9

    move-object/from16 p13, v10

    move-object/from16 p14, v11

    goto :goto_c

    :cond_c
    move-object/from16 p15, p13

    goto :goto_b

    :goto_c
    invoke-virtual/range {p2 .. p15}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->copy(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic hasErrors$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;ZILjava/lang/Object;)Z
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->hasErrors(Z)Z

    move-result p0

    return p0
.end method

.method public static synthetic isAnyFieldDirty$default(Lcom/whoop/profile/view/edit/form/EditProfileFormState;Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;ZILjava/lang/Object;)Z
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->isAnyFieldDirty(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Z)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final anyFieldValidating()Z
    .locals 13

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v5, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v6, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v7, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v8, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v9, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v10, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v11, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v12, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    filled-new-array/range {v0 .. v12}, [Lcom/whoop/profile/view/edit/form/FieldState;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    return v2

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating()Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_2
    return v2
.end method

.method public final component1()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component10()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component11()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component12()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component13()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component2()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component3()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component4()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component5()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component6()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component7()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component8()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final component9()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final copy(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)Lcom/whoop/profile/view/edit/form/EditProfileFormState;
    .locals 15

    const-string v0, "email"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "username"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "firstName"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lastName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "height"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "weight"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "unitSystem"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "gender"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "physiologicalBaseline"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "country"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "birthday"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "city"

    move-object/from16 v14, p13

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    invoke-direct/range {v1 .. v14}, Lcom/whoop/profile/view/edit/form/EditProfileFormState;-><init>(Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;Lcom/whoop/profile/view/edit/form/FieldState;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object p1, p1, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_e

    return v2

    :cond_e
    return v0
.end method

.method public final getBirthday()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getCity()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getCountry()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getEmail()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getFirstName()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getGender()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getHeight()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getLastName()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getPhysiologicalBaseline()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getState()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getUnitSystem()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getUsername()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final getWeight()Lcom/whoop/profile/view/edit/form/FieldState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    return-object v0
.end method

.method public final hasErrors(Z)Z
    .locals 3

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getHasBeenInteractedWith()Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getHasBeenValidated()Z

    move-result p1

    if-nez p1, :cond_1

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    if-lez p1, :cond_1

    :cond_0
    move p1, v1

    goto :goto_0

    :cond_1
    move p1, v0

    :goto_0
    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->isValidating()Z

    move-result v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getHasBeenInteractedWith()Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getHasBeenValidated()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_2

    goto/16 :goto_1

    :cond_2
    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p1}, Lcom/whoop/profile/view/edit/form/FieldState;->getError()Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    :cond_3
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v1}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v0}, Lcom/whoop/profile/view/edit/form/FieldState;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    return v0
.end method

.method public final isAnyFieldDirty(Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;Z)Z
    .locals 4

    const-string v0, "original"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p2, :cond_0

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUsername()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, v0

    :goto_0
    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {v2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getEmail()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    if-nez p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getFirstName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getLastName()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getHeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getWeight()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getUnitSystem()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getGender()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getPhysiologicalBaseline()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCountry()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getState()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getBirthday()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_2

    iget-object p2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    invoke-virtual {p2}, Lcom/whoop/profile/view/edit/form/FieldState;->getValue()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFields;->getCity()Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/profile/presentation/edit/EditProfileViewState$EditableFieldState;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    return v0

    :cond_2
    :goto_1
    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->email:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v1, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->username:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v2, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->firstName:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v3, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->lastName:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v4, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->height:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v5, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->weight:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v6, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->unitSystem:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v7, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->gender:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v8, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->physiologicalBaseline:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v9, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->country:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v10, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->state:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v11, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->birthday:Lcom/whoop/profile/view/edit/form/FieldState;

    iget-object v12, p0, Lcom/whoop/profile/view/edit/form/EditProfileFormState;->city:Lcom/whoop/profile/view/edit/form/FieldState;

    new-instance v13, Ljava/lang/StringBuilder;

    const-string v14, "EditProfileFormState(email="

    invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", username="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", firstName="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", lastName="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", height="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weight="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", unitSystem="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", gender="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", physiologicalBaseline="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", country="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", state="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", birthday="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", city="

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
