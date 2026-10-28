.class public final Lb5/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lb5/g;


# instance fields
.field public final a:Lb5/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Locale;

    new-instance v1, Landroid/os/LocaleList;

    invoke-direct {v1, v0}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    invoke-static {v1}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object v0

    sput-object v0, Lb5/g;->b:Lb5/g;

    return-void
.end method

.method public constructor <init>(Lb5/h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb5/g;->a:Lb5/h;

    return-void
.end method

.method public static a(Ljava/lang/String;)Lb5/g;
    .locals 5

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, ","

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    array-length v0, p0

    new-array v1, v0, [Ljava/util/Locale;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    aget-object v3, p0, v2

    sget v4, Lb5/f;->a:I

    invoke-static {v3}, Ljava/util/Locale;->forLanguageTag(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Landroid/os/LocaleList;

    invoke-direct {p0, v1}, Landroid/os/LocaleList;-><init>([Ljava/util/Locale;)V

    invoke-static {p0}, Lb5/g;->f(Landroid/os/LocaleList;)Lb5/g;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    sget-object p0, Lb5/g;->b:Lb5/g;

    return-object p0
.end method

.method public static f(Landroid/os/LocaleList;)Lb5/g;
    .locals 2

    new-instance v0, Lb5/g;

    new-instance v1, Lb5/h;

    invoke-direct {v1, p0}, Lb5/h;-><init>(Landroid/os/LocaleList;)V

    invoke-direct {v0, v1}, Lb5/g;-><init>(Lb5/h;)V

    return-object v0
.end method


# virtual methods
.method public final b(I)Ljava/util/Locale;
    .locals 1

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    iget-object v0, v0, Lb5/h;->a:Landroid/os/LocaleList;

    invoke-virtual {v0, p1}, Landroid/os/LocaleList;->get(I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public final c()Z
    .locals 1

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    iget-object v0, v0, Lb5/h;->a:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final d()I
    .locals 1

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    iget-object v0, v0, Lb5/h;->a:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->size()I

    move-result v0

    return v0
.end method

.method public final e()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    iget-object v0, v0, Lb5/h;->a:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->toLanguageTags()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lb5/g;

    if-eqz v0, :cond_0

    check-cast p1, Lb5/g;

    iget-object p1, p1, Lb5/g;->a:Lb5/h;

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    invoke-virtual {v0, p1}, Lb5/h;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    iget-object v0, v0, Lb5/h;->a:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb5/g;->a:Lb5/h;

    iget-object v0, v0, Lb5/h;->a:Landroid/os/LocaleList;

    invoke-virtual {v0}, Landroid/os/LocaleList;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
