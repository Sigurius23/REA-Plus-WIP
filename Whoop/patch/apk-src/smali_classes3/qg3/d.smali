.class public final Lqg3/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lab/e0;
.implements Lxn/e;
.implements Lfn/u;
.implements Lhn/j;
.implements Li9/j;
.implements Lud3/k;
.implements Lq/a;
.implements Lim/b;
.implements Lo23/a;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 3

    const/16 v0, 0x10

    iput v0, p0, Lqg3/d;->w:I

    .line 17
    new-instance v0, Lhn/b;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lhn/b;-><init>(II)V

    new-instance v1, Lhn/b;

    const/4 v2, 0x1

    invoke-direct {v1, p1, v2}, Lhn/b;-><init>(II)V

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 20
    iput-object v1, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(IB)V
    .locals 9

    iput p1, p0, Lqg3/d;->w:I

    const/4 p2, 0x0

    sparse-switch p1, :sswitch_data_0

    sget-object p1, Lcom/google/crypto/tink/internal/a;->c:Lqg3/d;

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    new-instance p2, La33/d;

    iget-object v0, p1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, La33/d;

    invoke-direct {p2, v0}, La33/d;-><init>(La33/d;)V

    iput-object p2, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 41
    iget-object p1, p1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, [J

    const/16 p2, 0xa

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([JI)[J

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void

    .line 42
    :sswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 43
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 44
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void

    .line 45
    :sswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    const-string p1, "Video:SfuSocketState"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 47
    new-instance p1, La3/z0;

    const/16 p2, 0xc

    sget-object v0, Li53/g;->a:Li53/g;

    invoke-direct {p1, p2, v0, p0}, La3/z0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void

    .line 48
    :sswitch_2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 49
    new-instance p1, Lrm/j1;

    invoke-direct {p1, p2}, Lrm/j1;-><init>(I)V

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 50
    new-instance p1, Lrm/j1;

    invoke-direct {p1, p2}, Lrm/j1;-><init>(I)V

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void

    .line 51
    :sswitch_3
    sget-object p1, Le40/b;->a:Ljava/lang/Object;

    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    new-instance p1, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 54
    sget-object v0, Lcom/stripe/android/uicore/address/FieldType;->AddressLine1:Lcom/stripe/android/uicore/address/FieldType;

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 55
    invoke-direct {p1, v0, v1, v2}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    .line 56
    new-instance v0, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 57
    sget-object v3, Lcom/stripe/android/uicore/address/FieldType;->AddressLine2:Lcom/stripe/android/uicore/address/FieldType;

    .line 58
    invoke-direct {v0, v3, p2, v2}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    .line 59
    new-instance p2, Lcom/stripe/android/uicore/address/CountryAddressSchema;

    .line 60
    sget-object v2, Lcom/stripe/android/uicore/address/FieldType;->Locality:Lcom/stripe/android/uicore/address/FieldType;

    .line 61
    sget-object v6, Lcom/stripe/android/uicore/address/NameType;->City:Lcom/stripe/android/uicore/address/NameType;

    .line 62
    new-instance v3, Lcom/stripe/android/uicore/address/FieldSchema;

    const/4 v7, 0x2

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/stripe/android/uicore/address/FieldSchema;-><init>(ZLjava/util/ArrayList;Lcom/stripe/android/uicore/address/NameType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 63
    invoke-direct {p2, v2, v1, v3}, Lcom/stripe/android/uicore/address/CountryAddressSchema;-><init>(Lcom/stripe/android/uicore/address/FieldType;ZLcom/stripe/android/uicore/address/FieldSchema;)V

    filled-new-array {p1, v0, p2}, [Lcom/stripe/android/uicore/address/CountryAddressSchema;

    move-result-object p1

    .line 64
    invoke-static {p1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    .line 65
    const-string p2, "ZZ"

    .line 66
    invoke-static {p2, p1}, Le40/i;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 67
    sget-object p1, Le40/b;->a:Ljava/lang/Object;

    .line 68
    new-instance p2, Ljava/util/LinkedHashMap;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v0

    invoke-static {v0}, Lm83/g0;->W(I)I

    move-result v0

    invoke-direct {p2, v0}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 69
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    .line 70
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    .line 71
    check-cast v0, Ljava/util/Map$Entry;

    .line 72
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    .line 73
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Le40/a;

    .line 74
    invoke-interface {v0}, Le40/a;->a()Ljava/util/List;

    move-result-object v0

    invoke-static {v2, v0}, Le40/i;->b(Ljava/lang/String;Ljava/util/List;)Ljava/util/ArrayList;

    move-result-object v0

    .line 75
    invoke-interface {p2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 76
    :cond_0
    iput-object p2, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xd -> :sswitch_3
        0xe -> :sswitch_2
        0xf -> :sswitch_1
        0x14 -> :sswitch_0
    .end sparse-switch
.end method

.method public synthetic constructor <init>(IC)V
    .locals 0

    .line 1
    iput p1, p0, Lqg3/d;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 2
    iput p1, p0, Lqg3/d;->w:I

    iput-object p2, p0, Lqg3/d;->x:Ljava/lang/Object;

    iput-object p3, p0, Lqg3/d;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lab/j0;)V
    .locals 4

    const/4 v0, 0x2

    iput v0, p0, Lqg3/d;->w:I

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    .line 82
    new-instance p1, Llo/s;

    const/4 v0, 0x4

    new-array v1, v0, [B

    const/4 v2, 0x5

    const/4 v3, 0x0

    .line 83
    invoke-direct {p1, v1, v0, v2, v3}, Llo/s;-><init>([BIIB)V

    .line 84
    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lqg3/d;->w:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x1d

    iput v0, p0, Lqg3/d;->w:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-eqz p2, :cond_1

    .line 22
    iput-object p2, p0, Lqg3/d;->y:Ljava/lang/Object;

    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    if-nez p3, :cond_0

    .line 24
    invoke-static {p1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    .line 25
    invoke-virtual {p1, p3, p2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    invoke-interface {p1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    :goto_0
    return-void

    .line 26
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "keysetName cannot be null"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public constructor <init>(Le53/d;)V
    .locals 1

    const/16 v0, 0xa

    iput v0, p0, Lqg3/d;->w:I

    const-string v0, "tokenRepository"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lfn/x;)V
    .locals 4

    const/16 v0, 0xc

    iput v0, p0, Lqg3/d;->w:I

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    .line 78
    new-instance p1, Llo/s;

    const/4 v0, 0x4

    new-array v1, v0, [B

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 79
    invoke-direct {p1, v1, v0, v2, v3}, Llo/s;-><init>([BIIB)V

    .line 80
    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lio/sentry/android/replay/video/d;)V
    .locals 1

    const/16 v0, 0x1c

    iput v0, p0, Lqg3/d;->w:I

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 6
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lj43/g;)V
    .locals 1

    const/16 v0, 0x13

    iput v0, p0, Lqg3/d;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 9
    const-string p1, "IncomingCallPresenter"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V
    .locals 0

    .line 3
    iput p4, p0, Lqg3/d;->w:I

    iput-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    iput-object p2, p0, Lqg3/d;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const/16 v0, 0x15

    iput v0, p0, Lqg3/d;->w:I

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    const-string v0, ".lck"

    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ln10/o0;Lqy/d;)V
    .locals 1

    const/16 v0, 0x18

    iput v0, p0, Lqg3/d;->w:I

    const-string v0, "intentFirstConfirmationInterceptorFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 16
    iput-object p2, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lu8/n;Landroid/util/SparseArray;)V
    .locals 5

    const/4 v0, 0x5

    iput v0, p0, Lqg3/d;->w:I

    .line 27
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    iput-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    .line 29
    new-instance v0, Landroid/util/SparseArray;

    .line 30
    iget-object v1, p1, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    .line 31
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v2

    .line 32
    invoke-direct {v0, v2}, Landroid/util/SparseArray;-><init>(I)V

    const/4 v2, 0x0

    .line 33
    :goto_0
    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_0

    .line 34
    invoke-virtual {p1, v2}, Lu8/n;->a(I)I

    move-result v3

    .line 35
    invoke-virtual {p2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lc9/a;

    .line 36
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    invoke-virtual {v0, v3, v4}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 38
    :cond_0
    iput-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public A(Lov/a;)V
    .locals 3

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/d;

    iget-object v1, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/util/LinkedHashMap;

    invoke-interface {v1, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    sget-object v2, Lov/b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v2, p1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    iget-object p1, v0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast p1, Lou/i;

    goto :goto_0

    :cond_0
    iget-object p1, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast p1, Lou/c;

    :goto_0
    iput-boolean v1, p1, Lou/a;->g:Z

    if-nez v1, :cond_1

    iget-boolean v0, p1, Lou/h;->q:Z

    if-eqz v0, :cond_1

    iput-boolean v2, p1, Lou/h;->r:Z

    :cond_1
    return-void
.end method

.method public B(Lov/a;)V
    .locals 4

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lio/sentry/android/replay/video/d;

    sget-object v1, Lov/b;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    iget-object v0, v0, Lio/sentry/android/replay/video/d;->e:Ljava/lang/Object;

    check-cast v0, Lou/i;

    goto :goto_0

    :cond_0
    iget-object v0, v0, Lio/sentry/android/replay/video/d;->h:Ljava/lang/Object;

    check-cast v0, Lou/c;

    :goto_0
    iget-boolean v1, v0, Lou/a;->g:Z

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iget-object v3, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v3, Ljava/util/LinkedHashMap;

    invoke-interface {v3, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, v0, Lou/a;->g:Z

    iget-boolean p1, v0, Lou/h;->q:Z

    if-eqz p1, :cond_1

    iput-boolean v2, v0, Lou/h;->r:Z

    :cond_1
    return-void
.end method

.method public C(Landroid/content/Context;Landroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)Lj43/h;
    .locals 4

    const-string v0, "android.permission.POST_NOTIFICATIONS"

    invoke-static {p1, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p1, Lt23/i3;->b:Lt23/j3;

    if-eqz p1, :cond_1

    check-cast p1, Lt23/b4;

    invoke-virtual {p1}, Lt23/b4;->c()Ld1/j;

    move-result-object p1

    if-eqz p1, :cond_1

    sget-object v0, Le43/i;->b:Le43/i;

    invoke-virtual {p3, v0}, Lio/getstream/video/android/model/StreamCallId;->getNotificationId(Le43/m;)I

    move-result v0

    invoke-virtual {p1, v0, p2, p3}, Ld1/j;->C(ILandroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)V

    :cond_1
    sget-object p1, Lj43/h;->y:Lj43/h;

    return-object p1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Lqg3/d;->r()Lb23/k;

    move-result-object p3

    iget-object v1, p3, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->E:Lb23/g;

    iget-object v3, p3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p3, Lb23/k;->b:Lb23/j;

    iget-object p3, p3, Lb23/k;->a:Ljava/lang/String;

    invoke-static {p1, v0}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    const/4 v0, 0x0

    const/4 v3, 0x1

    if-nez p1, :cond_3

    move p1, v3

    goto :goto_1

    :cond_3
    move p1, v0

    :goto_1
    if-eqz p2, :cond_4

    move v0, v3

    :cond_4
    new-instance p2, Ljava/lang/StringBuilder;

    const-string v3, "[showIncomingCall] Cannot show notification - permission="

    invoke-direct {p2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string p1, ", notification="

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x0

    invoke-interface {v1, v2, p3, p1, p2}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    sget-object p1, Lj43/h;->z:Lj43/h;

    return-object p1
.end method

.method public D(Lq/b;)V
    .locals 3

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lq/a;

    invoke-interface {v0, p1}, Lq/a;->D(Lq/b;)V

    iget-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, Lm/a0;

    iget-object v0, p1, Lm/a0;->W:Landroid/widget/PopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p1, Lm/a0;->L:Landroid/view/Window;

    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    iget-object v1, p1, Lm/a0;->X:Lbq/b;

    invoke-virtual {v0, v1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    :cond_0
    iget-object v0, p1, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    if-eqz v0, :cond_2

    iget-object v0, p1, Lm/a0;->Y:Lh5/t0;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lh5/t0;->b()V

    :cond_1
    iget-object v0, p1, Lm/a0;->V:Landroidx/appcompat/widget/ActionBarContextView;

    invoke-static {v0}, Lh5/p0;->a(Landroid/view/View;)Lh5/t0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lh5/t0;->a(F)V

    iput-object v0, p1, Lm/a0;->Y:Lh5/t0;

    new-instance v1, Lm/r;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lm/r;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Lh5/t0;->d(Lh5/u0;)V

    :cond_2
    iget-object v0, p1, Lm/a0;->N:Ljava/lang/Object;

    iget-object v1, p1, Lm/a0;->U:Lq/b;

    invoke-interface {v0, v1}, Lm/n;->onSupportActionModeFinished(Lq/b;)V

    const/4 v0, 0x0

    iput-object v0, p1, Lm/a0;->U:Lq/b;

    iget-object v0, p1, Lm/a0;->a0:Landroid/view/ViewGroup;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Lh5/f0;->c(Landroid/view/View;)V

    invoke-virtual {p1}, Lm/a0;->M()V

    return-void
.end method

.method public bridge synthetic a(Lhn/i;)Lhn/k;
    .locals 0

    invoke-virtual {p0, p1}, Lqg3/d;->m(Lhn/i;)Lhn/c;

    move-result-object p1

    return-object p1
.end method

.method public b(J)I
    .locals 2

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Llo/y;->b([JJZ)I

    move-result p1

    array-length p2, v0

    if-ge p1, p2, :cond_0

    return p1

    :cond_0
    const/4 p1, -0x1

    return p1
.end method

.method public c(Lx8/n;)V
    .locals 10

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Lab/j0;

    iget-object v1, v0, Lab/j0;->g:Landroid/util/SparseArray;

    iget-object v2, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v2, Llo/s;

    invoke-virtual {p1}, Lx8/n;->t()I

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lx8/n;->t()I

    move-result v3

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_1

    :goto_0
    return-void

    :cond_1
    const/4 v3, 0x6

    invoke-virtual {p1, v3}, Lx8/n;->G(I)V

    invoke-virtual {p1}, Lx8/n;->a()I

    move-result v3

    const/4 v4, 0x4

    div-int/2addr v3, v4

    const/4 v5, 0x0

    move v6, v5

    :goto_1
    if-ge v6, v3, :cond_4

    iget-object v7, v2, Llo/s;->b:[B

    invoke-virtual {p1, v7, v5, v4}, Lx8/n;->e([BII)V

    invoke-virtual {v2, v5}, Llo/s;->q(I)V

    const/16 v7, 0x10

    invoke-virtual {v2, v7}, Llo/s;->i(I)I

    move-result v7

    const/4 v8, 0x3

    invoke-virtual {v2, v8}, Llo/s;->t(I)V

    const/16 v8, 0xd

    if-nez v7, :cond_2

    invoke-virtual {v2, v8}, Llo/s;->t(I)V

    goto :goto_2

    :cond_2
    invoke-virtual {v2, v8}, Llo/s;->i(I)I

    move-result v7

    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_3

    new-instance v8, Lab/f0;

    new-instance v9, Lab/i0;

    invoke-direct {v9, v0, v7}, Lab/i0;-><init>(Lab/j0;I)V

    invoke-direct {v8, v9}, Lab/f0;-><init>(Lab/e0;)V

    invoke-virtual {v1, v7, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget v7, v0, Lab/j0;->m:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v0, Lab/j0;->m:I

    :cond_3
    :goto_2
    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_4
    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public d(J)Ljava/util/List;
    .locals 2

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    const/4 v1, 0x0

    invoke-static {v0, p1, p2, v1}, Llo/y;->e([JJZ)I

    move-result p1

    const/4 p2, -0x1

    if-eq p1, p2, :cond_1

    iget-object p2, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p2, [Lxn/b;

    aget-object p1, p2, p1

    sget-object p2, Lxn/b;->R:Lxn/b;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object p1
.end method

.method public bridge synthetic e(La30/w0;)Li9/k;
    .locals 0

    invoke-virtual {p0, p1}, Lqg3/d;->n(La30/w0;)Li9/b;

    move-result-object p1

    return-object p1
.end method

.method public f(Led3/a;)V
    .locals 10

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Lfn/x;

    iget-object v1, v0, Lfn/x;->f:Landroid/util/SparseArray;

    iget-object v2, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v2, Llo/s;

    invoke-virtual {p1}, Led3/a;->y()I

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Led3/a;->y()I

    move-result v3

    and-int/lit16 v3, v3, 0x80

    if-nez v3, :cond_1

    goto :goto_2

    :cond_1
    const/4 v3, 0x6

    invoke-virtual {p1, v3}, Led3/a;->L(I)V

    invoke-virtual {p1}, Led3/a;->a()I

    move-result v3

    const/4 v4, 0x4

    div-int/2addr v3, v4

    const/4 v5, 0x0

    move v6, v5

    :goto_0
    if-ge v6, v3, :cond_4

    iget-object v7, v2, Llo/s;->b:[B

    invoke-virtual {p1, v7, v5, v4}, Led3/a;->g([BII)V

    invoke-virtual {v2, v5}, Llo/s;->q(I)V

    const/16 v7, 0x10

    invoke-virtual {v2, v7}, Llo/s;->i(I)I

    move-result v7

    const/4 v8, 0x3

    invoke-virtual {v2, v8}, Llo/s;->t(I)V

    const/16 v8, 0xd

    if-nez v7, :cond_2

    invoke-virtual {v2, v8}, Llo/s;->t(I)V

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v8}, Llo/s;->i(I)I

    move-result v7

    invoke-virtual {v1, v7}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_3

    new-instance v8, Lfn/v;

    new-instance v9, Lab/i0;

    invoke-direct {v9, v0, v7}, Lab/i0;-><init>(Lfn/x;I)V

    invoke-direct {v8, v9}, Lfn/v;-><init>(Lfn/u;)V

    invoke-virtual {v1, v7, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget v7, v0, Lfn/x;->l:I

    add-int/lit8 v7, v7, 0x1

    iput v7, v0, Lfn/x;->l:I

    :cond_3
    :goto_1
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_4
    iget p1, v0, Lfn/x;->a:I

    const/4 v0, 0x2

    if-eq p1, v0, :cond_5

    invoke-virtual {v1, v5}, Landroid/util/SparseArray;->remove(I)V

    :cond_5
    :goto_2
    return-void
.end method

.method public g(Lx8/s;Lt9/q;Lab/l0;)V
    .locals 0

    return-void
.end method

.method public get()Ljava/lang/Object;
    .locals 6

    new-instance v1, Lng3/n;

    const/16 v0, 0xe

    invoke-direct {v1, v0}, Lng3/n;-><init>(I)V

    new-instance v2, Lng3/o;

    const/16 v0, 0xd

    const/4 v3, 0x0

    invoke-direct {v2, v0, v3}, Lng3/o;-><init>(IZ)V

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lk83/a;

    invoke-interface {v0}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v0

    iget-object v3, p0, Lqg3/d;->y:Ljava/lang/Object;

    move-object v5, v3

    check-cast v5, Lk83/a;

    move-object v3, v0

    new-instance v0, Lnm/i;

    move-object v4, v3

    check-cast v4, Lnm/k;

    sget-object v3, Lnm/a;->f:Lnm/a;

    invoke-direct/range {v0 .. v5}, Lnm/i;-><init>(Lpm/a;Lpm/a;Lnm/a;Lnm/k;Lk83/a;)V

    return-object v0
.end method

.method public h(I)J
    .locals 4

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ltz p1, :cond_0

    move v3, v2

    goto :goto_0

    :cond_0
    move v3, v1

    :goto_0
    invoke-static {v3}, Llo/a;->e(Z)V

    array-length v3, v0

    if-ge p1, v3, :cond_1

    move v1, v2

    :cond_1
    invoke-static {v1}, Llo/a;->e(Z)V

    aget-wide v0, v0, p1

    return-wide v0
.end method

.method public i(Llo/x;Lwm/k;Lab/l0;)V
    .locals 0

    return-void
.end method

.method public j()I
    .locals 1

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, [J

    array-length v0, v0

    return v0
.end method

.method public k()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    iput-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    return-void
.end method

.method public l(I)Z
    .locals 1

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lu8/n;

    iget-object v0, v0, Lu8/n;->a:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    return p1
.end method

.method public m(Lhn/i;)Lhn/c;
    .locals 5

    iget-object v0, p1, Lhn/i;->a:Lhn/l;

    iget-object v0, v0, Lhn/l;->a:Ljava/lang/String;

    const/4 v1, 0x0

    :try_start_0
    const-string v2, "createCodec:"

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v2, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v0, v1

    goto :goto_1

    :cond_0
    new-instance v3, Ljava/lang/String;

    invoke-direct {v3, v2}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    move-object v2, v3

    :goto_0
    invoke-static {v2}, Llo/a;->c(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    new-instance v2, Lhn/c;

    iget-object v3, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v3, Lhn/b;

    invoke-virtual {v3}, Lhn/b;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/HandlerThread;

    iget-object v4, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v4, Lhn/b;

    invoke-virtual {v4}, Lhn/b;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/HandlerThread;

    invoke-direct {v2, v0, v3, v4}, Lhn/c;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Landroid/os/HandlerThread;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    :try_start_2
    invoke-static {}, Llo/a;->o()V

    iget-object v1, p1, Lhn/i;->b:Landroid/media/MediaFormat;

    iget-object v3, p1, Lhn/i;->d:Landroid/view/Surface;

    iget-object p1, p1, Lhn/i;->e:Landroid/media/MediaCrypto;

    invoke-static {v2, v1, v3, p1}, Lhn/c;->g(Lhn/c;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    return-object v2

    :catch_1
    move-exception p1

    move-object v1, v2

    goto :goto_1

    :catch_2
    move-exception p1

    :goto_1
    if-nez v1, :cond_1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    goto :goto_2

    :cond_1
    invoke-virtual {v1}, Lhn/c;->release()V

    :cond_2
    :goto_2
    throw p1
.end method

.method public n(La30/w0;)Li9/b;
    .locals 6

    const-string v0, "createCodec:"

    iget-object v1, p1, La30/w0;->x:Ljava/lang/Object;

    check-cast v1, Li9/m;

    iget-object v1, v1, Li9/m;->a:Ljava/lang/String;

    const/4 v2, 0x0

    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    invoke-static {v1}, Landroid/media/MediaCodec;->createByCodecName(Ljava/lang/String;)Landroid/media/MediaCodec;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    new-instance v1, Li9/d;

    iget-object v3, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v3, Lhn/b;

    invoke-virtual {v3}, Lhn/b;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/os/HandlerThread;

    invoke-direct {v1, v0, v3}, Li9/d;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;)V

    new-instance v3, Li9/b;

    iget-object v4, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v4, Lhn/b;

    invoke-virtual {v4}, Lhn/b;->get()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/os/HandlerThread;

    iget-object v5, p1, La30/w0;->G:Ljava/lang/Object;

    check-cast v5, Li9/i;

    invoke-direct {v3, v0, v4, v1, v5}, Li9/b;-><init>(Landroid/media/MediaCodec;Landroid/os/HandlerThread;Li9/l;Li9/i;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    invoke-static {}, Landroid/os/Trace;->endSection()V

    iget-object v1, p1, La30/w0;->E:Ljava/lang/Object;

    check-cast v1, Landroid/view/Surface;

    if-nez v1, :cond_0

    iget-object v2, p1, La30/w0;->x:Ljava/lang/Object;

    check-cast v2, Li9/m;

    iget-boolean v2, v2, Li9/m;->h:Z

    if-eqz v2, :cond_0

    sget v2, Lx8/t;->a:I

    const/16 v4, 0x23

    if-lt v2, v4, :cond_0

    const/16 v2, 0x8

    goto :goto_0

    :catch_0
    move-exception p1

    move-object v2, v3

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    :goto_0
    iget-object v4, p1, La30/w0;->y:Ljava/lang/Object;

    check-cast v4, Landroid/media/MediaFormat;

    iget-object p1, p1, La30/w0;->F:Ljava/lang/Object;

    check-cast p1, Landroid/media/MediaCrypto;

    invoke-static {v3, v4, v1, p1, v2}, Li9/b;->l(Li9/b;Landroid/media/MediaFormat;Landroid/view/Surface;Landroid/media/MediaCrypto;I)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v3

    :catch_1
    move-exception p1

    goto :goto_1

    :catch_2
    move-exception p1

    move-object v0, v2

    :goto_1
    if-nez v2, :cond_1

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/media/MediaCodec;->release()V

    goto :goto_2

    :cond_1
    invoke-virtual {v2}, Li9/b;->release()V

    :cond_2
    :goto_2
    throw p1
.end method

.method public o(Lq/b;Landroid/view/MenuItem;)Z
    .locals 1

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lq/a;

    invoke-interface {v0, p1, p2}, Lq/a;->o(Lq/b;Landroid/view/MenuItem;)Z

    move-result p1

    return p1
.end method

.method public onFailure(Lud3/j;Ljava/io/IOException;)V
    .locals 2

    iget-object p1, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast p1, Lle3/g;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-static {p1, p2, v0, v1}, Lle3/g;->d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V

    return-void
.end method

.method public onResponse(Lud3/j;Lud3/x0;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p2

    :try_start_0
    iget-object v0, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lle3/g;

    invoke-virtual {v0, v2}, Lle3/g;->a(Lud3/x0;)Lne3/o0;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    iget-object v4, v2, Lud3/x0;->F:Lud3/d0;

    invoke-virtual {v4}, Lud3/d0;->size()I

    move-result v5

    const/4 v7, 0x0

    move v8, v7

    move v10, v8

    move v12, v10

    move v14, v12

    move v15, v14

    const/4 v11, 0x0

    const/4 v13, 0x0

    :goto_0
    if-ge v8, v5, :cond_12

    invoke-virtual {v4, v8}, Lud3/d0;->c(I)Ljava/lang/String;

    move-result-object v9

    const-string v6, "Sec-WebSocket-Extensions"

    invoke-virtual {v9, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    :cond_0
    move-object/from16 v16, v4

    goto/16 :goto_8

    :cond_1
    invoke-virtual {v4, v8}, Lud3/d0;->g(I)Ljava/lang/String;

    move-result-object v6

    move v9, v7

    :goto_1
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v9, v3, :cond_0

    const/16 v3, 0x2c

    move-object/from16 v16, v4

    const/4 v4, 0x4

    invoke-static {v6, v3, v9, v7, v4}, Lwd3/f;->g(Ljava/lang/String;CIII)I

    move-result v3

    const/16 v4, 0x3b

    invoke-static {v4, v9, v3, v6}, Lwd3/f;->e(CIILjava/lang/String;)I

    move-result v7

    invoke-static {v9, v7, v6}, Lwd3/f;->r(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const/16 v17, 0x1

    add-int/lit8 v7, v7, 0x1

    const-string v4, "permessage-deflate"

    invoke-virtual {v9, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_11

    if-eqz v10, :cond_2

    move/from16 v15, v17

    :cond_2
    move v9, v7

    :goto_2
    if-ge v9, v3, :cond_10

    const/16 v4, 0x3b

    invoke-static {v4, v9, v3, v6}, Lwd3/f;->e(CIILjava/lang/String;)I

    move-result v7

    const/16 v10, 0x3d

    invoke-static {v10, v9, v7, v6}, Lwd3/f;->e(CIILjava/lang/String;)I

    move-result v10

    invoke-static {v9, v10, v6}, Lwd3/f;->r(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v9

    if-ge v10, v7, :cond_3

    add-int/lit8 v10, v10, 0x1

    invoke-static {v10, v7, v6}, Lwd3/f;->r(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v4, "\""

    invoke-static {v10, v4, v4}, Lyb3/r;->t0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_3

    :cond_3
    const/4 v4, 0x0

    :goto_3
    add-int/lit8 v7, v7, 0x1

    const-string v10, "client_max_window_bits"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_7

    if-eqz v11, :cond_4

    move/from16 v15, v17

    :cond_4
    if-eqz v4, :cond_5

    invoke-static {v4}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    move-object v11, v4

    goto :goto_4

    :cond_5
    const/4 v11, 0x0

    :goto_4
    if-nez v11, :cond_2

    :cond_6
    :goto_5
    move v9, v7

    move/from16 v15, v17

    goto :goto_2

    :cond_7
    const-string v10, "client_no_context_takeover"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_a

    if-eqz v12, :cond_8

    move/from16 v15, v17

    :cond_8
    if-eqz v4, :cond_9

    move/from16 v15, v17

    :cond_9
    move v9, v7

    move/from16 v12, v17

    goto :goto_2

    :cond_a
    const-string v10, "server_max_window_bits"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_d

    if-eqz v13, :cond_b

    move/from16 v15, v17

    :cond_b
    if-eqz v4, :cond_c

    invoke-static {v4}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v4

    move-object v13, v4

    goto :goto_6

    :cond_c
    const/4 v13, 0x0

    :goto_6
    if-nez v13, :cond_2

    goto :goto_5

    :cond_d
    const-string v10, "server_no_context_takeover"

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_6

    if-eqz v14, :cond_e

    move/from16 v15, v17

    :cond_e
    if-eqz v4, :cond_f

    move/from16 v15, v17

    :cond_f
    move v9, v7

    move/from16 v14, v17

    goto :goto_2

    :cond_10
    move-object/from16 v4, v16

    move/from16 v10, v17

    :goto_7
    const/4 v7, 0x0

    goto/16 :goto_1

    :cond_11
    move v9, v7

    move-object/from16 v4, v16

    move/from16 v15, v17

    goto :goto_7

    :goto_8
    add-int/lit8 v8, v8, 0x1

    move-object/from16 v4, v16

    const/4 v7, 0x0

    goto/16 :goto_0

    :cond_12
    new-instance v9, Lle3/h;

    invoke-direct/range {v9 .. v15}, Lle3/h;-><init>(ZLjava/lang/Integer;ZLjava/lang/Integer;ZZ)V

    iget-object v3, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v3, Lle3/g;

    iput-object v9, v3, Lle3/g;->e:Lle3/h;

    if-eqz v15, :cond_13

    goto :goto_9

    :cond_13
    if-eqz v11, :cond_14

    goto :goto_9

    :cond_14
    if-eqz v13, :cond_16

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const/16 v4, 0x8

    if-gt v4, v3, :cond_15

    const/16 v4, 0x10

    if-ge v3, v4, :cond_15

    goto :goto_a

    :cond_15
    :goto_9
    iget-object v3, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v3, Lle3/g;

    monitor-enter v3

    :try_start_1
    iget-object v4, v3, Lle3/g;->q:Ljava/util/ArrayDeque;

    invoke-virtual {v4}, Ljava/util/ArrayDeque;->clear()V

    const-string v4, "unexpected Sec-WebSocket-Extensions in response header"

    const/16 v5, 0x3f2

    invoke-virtual {v3, v5, v4}, Lle3/g;->b(ILjava/lang/String;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    goto :goto_a

    :catchall_0
    move-exception v0

    monitor-exit v3

    throw v0

    :cond_16
    :goto_a
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    sget-object v4, Lwd3/h;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " WebSocket "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, v1, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v4, Lud3/o0;

    iget-object v4, v4, Lud3/o0;->a:Lud3/e0;

    invoke-virtual {v4}, Lud3/e0;->j()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v4, Lle3/g;

    new-instance v5, Ls/m2;

    invoke-direct {v5, v0}, Ls/m2;-><init>(Lne3/o0;)V

    const-string v0, " ping"

    const-string v6, "name"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v4, Lle3/g;->e:Lle3/h;

    invoke-static {v6}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    monitor-enter v4

    :try_start_2
    iput-object v3, v4, Lle3/g;->n:Ljava/lang/String;

    iput-object v5, v4, Lle3/g;->o:Ls/m2;

    new-instance v7, Lle3/k;

    iget-object v8, v5, Ls/m2;->y:Ljava/lang/Object;

    check-cast v8, Lne3/h0;

    iget-object v9, v4, Lle3/g;->c:Ljava/util/Random;

    iget-boolean v10, v6, Lle3/h;->a:Z

    iget-boolean v11, v6, Lle3/h;->c:Z

    iget-wide v12, v4, Lle3/g;->f:J

    invoke-direct/range {v7 .. v13}, Lle3/k;-><init>(Lne3/i;Ljava/util/Random;ZZJ)V

    iput-object v7, v4, Lle3/g;->l:Lle3/k;

    new-instance v7, Lle3/f;

    invoke-direct {v7, v4}, Lle3/f;-><init>(Lle3/g;)V

    iput-object v7, v4, Lle3/g;->j:Lle3/f;

    iget-wide v7, v4, Lle3/g;->d:J

    const-wide/16 v9, 0x0

    cmp-long v9, v7, v9

    if-eqz v9, :cond_17

    sget-object v9, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v9, v7, v8}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v7

    iget-object v9, v4, Lle3/g;->m:Lyd3/c;

    invoke-virtual {v3, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ll1/k0;

    const/4 v10, 0x1

    invoke-direct {v3, v4, v7, v8, v10}, Ll1/k0;-><init>(Ljava/lang/Object;JI)V

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "name"

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Lle3/f;

    invoke-direct {v10, v0, v3}, Lle3/f;-><init>(Ljava/lang/String;Lc93/a;)V

    invoke-virtual {v9, v10, v7, v8}, Lyd3/c;->d(Lyd3/a;J)V

    goto :goto_b

    :catchall_1
    move-exception v0

    goto :goto_f

    :cond_17
    :goto_b
    iget-object v0, v4, Lle3/g;->q:Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_18

    invoke-virtual {v4}, Lle3/g;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :cond_18
    monitor-exit v4

    new-instance v0, Lle3/j;

    iget-object v3, v5, Ls/m2;->x:Ljava/lang/Object;

    check-cast v3, Lne3/j0;

    iget-boolean v5, v6, Lle3/h;->a:Z

    iget-boolean v6, v6, Lle3/h;->e:Z

    invoke-direct {v0, v3, v4, v5, v6}, Lle3/j;-><init>(Lne3/j;Lle3/i;ZZ)V

    iput-object v0, v4, Lle3/g;->k:Lle3/j;

    iget-object v0, v1, Lqg3/d;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lle3/g;

    :try_start_3
    iget-object v0, v3, Lle3/g;->b:Lud3/f1;

    invoke-virtual {v0, v3, v2}, Lud3/f1;->onOpen(Lud3/e1;Lud3/x0;)V

    :goto_c
    iget v0, v3, Lle3/g;->t:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_19

    iget-object v0, v3, Lle3/g;->k:Lle3/j;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lle3/j;->b()V
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    goto :goto_c

    :catchall_2
    move-exception v0

    goto :goto_e

    :catch_0
    move-exception v0

    goto :goto_d

    :cond_19
    invoke-virtual {v3}, Lle3/g;->e()V

    return-void

    :goto_d
    const/4 v2, 0x6

    const/4 v4, 0x0

    :try_start_4
    invoke-static {v3, v0, v4, v2}, Lle3/g;->d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    invoke-virtual {v3}, Lle3/g;->e()V

    return-void

    :goto_e
    invoke-virtual {v3}, Lle3/g;->e()V

    throw v0

    :goto_f
    monitor-exit v4

    throw v0

    :catch_1
    move-exception v0

    iget-object v3, v1, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v3, Lle3/g;

    const/4 v4, 0x4

    invoke-static {v3, v0, v2, v4}, Lle3/g;->d(Lle3/g;Ljava/lang/Exception;Lud3/x0;I)V

    invoke-static {v2}, Lwd3/f;->b(Ljava/io/Closeable;)V

    iget-object v0, v2, Lud3/x0;->H:Lne3/o0;

    if-eqz v0, :cond_1a

    invoke-interface {v0}, Lne3/o0;->d()Lne3/n0;

    move-result-object v0

    if-eqz v0, :cond_1a

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_1a
    iget-object v0, v2, Lud3/x0;->H:Lne3/o0;

    if-eqz v0, :cond_1b

    invoke-interface {v0}, Lne3/o0;->getSource()Lne3/p0;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-static {v0}, Lwd3/f;->b(Ljava/io/Closeable;)V

    :cond_1b
    return-void
.end method

.method public onResult(Ln23/h;)V
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lo23/k;

    iget-object v0, v2, Lo23/k;->d:Lhc3/d;

    new-instance v1, Ln43/a;

    iget-object v3, p0, Lqg3/d;->y:Ljava/lang/Object;

    move-object v4, v3

    check-cast v4, Lo23/a;

    const/4 v6, 0x5

    const/4 v5, 0x0

    move-object v3, p1

    invoke-direct/range {v1 .. v6}, Ln43/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {v0, v5, v5, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public p(Landroid/net/Uri;)V
    .locals 7

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Lcom/iterable/iterableapi/d1;

    iget-object v1, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Lcom/iterable/iterableapi/j1;

    iget-object v2, v0, Lcom/iterable/iterableapi/d1;->x:Landroid/content/Context;

    invoke-static {}, Ldt/b;->F()V

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v3, "action://"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    const/4 v5, 0x3

    const-string v6, ""

    if-eqz v4, :cond_0

    invoke-virtual {p1, v3, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/iterable/iterableapi/c;->a(Ljava/lang/String;)Lcom/iterable/iterableapi/c;

    move-result-object p1

    invoke-static {v2, p1, v5}, Lug/m;->y(Landroid/content/Context;Lcom/iterable/iterableapi/c;I)Z

    goto :goto_1

    :cond_0
    const-string v3, "itbl://"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-virtual {p1, v3, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/iterable/iterableapi/c;->a(Ljava/lang/String;)Lcom/iterable/iterableapi/c;

    move-result-object p1

    invoke-static {v2, p1, v5}, Lug/m;->y(Landroid/content/Context;Lcom/iterable/iterableapi/c;I)Z

    goto :goto_1

    :cond_1
    const-string v3, "iterable://"

    invoke-virtual {p1, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1, v3, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "delete"

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Lcom/iterable/iterableapi/o0;->w:Lcom/iterable/iterableapi/m0;

    sget-object v2, Lcom/iterable/iterableapi/a1;->w:Lcom/iterable/iterableapi/y0;

    invoke-virtual {v0, v1, p1, v2}, Lcom/iterable/iterableapi/d1;->g(Lcom/iterable/iterableapi/j1;Lcom/iterable/iterableapi/m0;Lcom/iterable/iterableapi/y0;)V

    goto :goto_1

    :cond_2
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "type"

    const-string v4, "openUrl"

    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v3, "data"

    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    new-instance p1, Lcom/iterable/iterableapi/c;

    invoke-direct {p1, v1}, Lcom/iterable/iterableapi/c;-><init>(Lorg/json/JSONObject;)V
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {v2, p1, v5}, Lug/m;->y(Landroid/content/Context;Lcom/iterable/iterableapi/c;I)Z

    :cond_3
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/iterable/iterableapi/d1;->J:J

    invoke-virtual {v0}, Lcom/iterable/iterableapi/d1;->h()V

    return-void
.end method

.method public q()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    const-string v1, "HealthData#"

    const-string v2, "#androidx.health.ACTION_BIND_HEALTH_DATA_SERVICE"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()Lb23/k;
    .locals 1

    iget v0, p0, Lqg3/d;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_0
    .end packed-switch
.end method

.method public s()Ly43/b;
    .locals 1

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly43/b;

    return-object v0
.end method

.method public t(Lq/b;Landroid/view/Menu;)Z
    .locals 1

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lq/a;

    invoke-interface {v0, p1, p2}, Lq/a;->t(Lq/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lqg3/d;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    if-eqz v0, :cond_0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Result{isError=true, error=\""

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\"}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Result{isError=false, response="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Lpg3/v0;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public u(Landroid/content/Context;Lj43/i;Landroid/app/Notification;)Lj43/h;
    .locals 5

    iget-object v0, p2, Lj43/i;->d:Lj43/c;

    iget-object v0, v0, Lj43/c;->d:Ljava/lang/Class;

    iget-object v1, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v1, Lj43/g;

    invoke-virtual {v1, p1, v0}, Lj43/g;->d(Landroid/content/Context;Ljava/lang/Class;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p2, Lj43/i;->a:Lio/getstream/video/android/model/StreamCallId;

    invoke-virtual {p0, p1, p3, p2}, Lqg3/d;->C(Landroid/content/Context;Landroid/app/Notification;Lio/getstream/video/android/model/StreamCallId;)Lj43/h;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0}, Lqg3/d;->r()Lb23/k;

    move-result-object p3

    iget-object v0, p3, Lb23/k;->c:Lb23/e;

    iget-object v2, p3, Lb23/k;->a:Ljava/lang/String;

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-interface {v0, v3, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p3, p3, Lb23/k;->b:Lb23/j;

    const-string v0, "[showIncomingCall] Starting regular service"

    const/4 v4, 0x0

    invoke-interface {p3, v3, v2, v0, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    invoke-virtual {v1, p1, p2}, Lj43/g;->a(Landroid/content/Context;Lj43/i;)Landroid/content/Intent;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    sget-object p1, Lj43/h;->x:Lj43/h;

    return-object p1
.end method

.method public v()Z
    .locals 7

    sget-object v0, Lt23/j3;->t:Lt23/i3;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, Lt23/i3;->b:Lt23/j3;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast v0, Lt23/b4;

    iget-object v0, v0, Lt23/b4;->U:Lt23/g1;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lt23/g1;->h:Lec3/h2;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt23/c0;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    const/4 v2, 0x1

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-virtual {p0}, Lqg3/d;->r()Lb23/k;

    move-result-object v3

    iget-object v4, v3, Lb23/k;->c:Lb23/e;

    sget-object v5, Lb23/g;->y:Lb23/g;

    iget-object v6, v3, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v4, v5, v6}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    iget-object v4, v3, Lb23/k;->b:Lb23/j;

    iget-object v3, v3, Lb23/k;->a:Ljava/lang/String;

    const-string v6, "[showIncomingCall] hasActiveCall: "

    invoke-static {v6, v0}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v5, v3, v6, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    xor-int/2addr v0, v2

    return v0
.end method

.method public w(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Le53/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Le53/b;

    iget v1, v0, Le53/b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Le53/b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Le53/b;

    invoke-direct {v0, p0, p1}, Le53/b;-><init>(Lqg3/d;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Le53/b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Le53/b;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Le53/b;->w:Lqg3/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast p1, Lio/sentry/internal/debugmeta/c;

    if-eqz p1, :cond_4

    iput-object p0, v0, Le53/b;->w:Lqg3/d;

    iput v3, v0, Le53/b;->z:I

    invoke-virtual {p1, v0}, Lio/sentry/internal/debugmeta/c;->e(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    iget-object v0, v0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Le53/d;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v2, "token"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, v0, Le53/d;->a:Ljava/lang/Object;

    return-object p1

    :cond_4
    const-string p1, "provider"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public x()V
    .locals 5

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v1, Ljava/nio/channels/FileChannel;

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    :try_start_0
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_2

    :cond_1
    :goto_0
    new-instance v2, Ljava/io/FileOutputStream;

    invoke-direct {v2, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    invoke-virtual {v2}, Ljava/io/FileOutputStream;->getChannel()Ljava/nio/channels/FileChannel;

    move-result-object v1

    iput-object v1, p0, Lqg3/d;->y:Ljava/lang/Object;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/nio/channels/FileChannel;->lock()Ljava/nio/channels/FileLock;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_2
    :goto_1
    return-void

    :goto_2
    iget-object v2, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v2, Ljava/nio/channels/FileChannel;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/nio/channels/spi/AbstractInterruptibleChannel;->close()V

    :cond_3
    const/4 v2, 0x0

    iput-object v2, p0, Lqg3/d;->y:Ljava/lang/Object;

    new-instance v2, Ljava/lang/IllegalStateException;

    const-string v3, "Unable to lock file: \'"

    const-string v4, "\'."

    invoke-static {v3, v0, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2
.end method

.method public y(Lh53/d;Ls83/c;)V
    .locals 4

    instance-of v0, p2, Lh53/g;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh53/g;

    iget v1, v0, Lh53/g;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh53/g;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh53/g;

    invoke-direct {v0, p0, p2}, Lh53/g;-><init>(Lqg3/d;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lh53/g;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, v0, Lh53/g;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p2}, Lb9/y;->v(Ljava/lang/Object;)Lkotlin/KotlinNothingValueException;

    move-result-object p1

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lqg3/d;->s()Ly43/b;

    move-result-object p2

    iget-object p2, p2, Ly43/b;->e:Lec3/h2;

    new-instance v1, Lf53/m;

    invoke-direct {v1, v2, p1}, Lf53/m;-><init>(ILc93/m;)V

    iput v2, v0, Lh53/g;->y:I

    invoke-virtual {p2, v1, v0}, Lec3/h2;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    return-void
.end method

.method public z(Lq/b;Landroid/view/Menu;)Z
    .locals 2

    iget-object v0, p0, Lqg3/d;->y:Ljava/lang/Object;

    check-cast v0, Lm/a0;

    iget-object v0, v0, Lm/a0;->a0:Landroid/view/ViewGroup;

    sget-object v1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0}, Lh5/f0;->c(Landroid/view/View;)V

    iget-object v0, p0, Lqg3/d;->x:Ljava/lang/Object;

    check-cast v0, Lq/a;

    invoke-interface {v0, p1, p2}, Lq/a;->z(Lq/b;Landroid/view/Menu;)Z

    move-result p1

    return p1
.end method
