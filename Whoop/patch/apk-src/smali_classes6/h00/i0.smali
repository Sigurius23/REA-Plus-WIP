.class public final Lh00/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk00/a;


# static fields
.field public static final a:Lh00/i0;

.field public static final b:Lzy/b;

.field public static final c:Ljava/lang/String;

.field public static final d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh00/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lh00/i0;->a:Lh00/i0;

    const v0, 0x7f141048

    invoke-static {v0}, Ls4/i;->h(I)Lzy/b;

    move-result-object v0

    sput-object v0, Lh00/i0;->b:Lzy/b;

    const-string v0, "logout_menu_row_tag"

    sput-object v0, Lh00/i0;->c:Ljava/lang/String;

    const/4 v0, 0x1

    sput-boolean v0, Lh00/i0;->d:Z

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    sget-object v0, Lh00/i0;->c:Ljava/lang/String;

    return-object v0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lh00/i0;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public final getText()Lzy/c;
    .locals 1

    sget-object v0, Lh00/i0;->b:Lzy/b;

    return-object v0
.end method

.method public final hashCode()I
    .locals 1

    const v0, -0x5f323c0b

    return v0
.end method

.method public final isDestructive()Z
    .locals 1

    sget-boolean v0, Lh00/i0;->d:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    const-string v0, "LogoutMenuItem"

    return-object v0
.end method
