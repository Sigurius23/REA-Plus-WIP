.class public final Lxu2/a$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxu2/a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lxu2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c7\n\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0010\u0010\u0008\u001a\u00020\u0007H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001a\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00d6\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u000c8\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0010\u001a\u0004\u0008\u000f\u0010\u0012R\u001a\u0010\u001f\u001a\u00020\u001b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u0015\u0010\u001e\u00a8\u0006 "
    }
    d2 = {
        "Lxu2/a$a;",
        "Lxu2/a;",
        "<init>",
        "()V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "b",
        "Z",
        "a",
        "()Z",
        "enabled",
        "Lcom/whoop/design/util/TextResource$b;",
        "c",
        "Lcom/whoop/design/util/TextResource$b;",
        "d",
        "()Lcom/whoop/design/util/TextResource$b;",
        "text",
        "useAccentColor",
        "Lhu2/b;",
        "e",
        "Lhu2/b;",
        "()Lhu2/b;",
        "clickEvent",
        "weightlifting_release"
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
.field public static final a:Lxu2/a$a;

.field private static final b:Z

.field private static final c:Lcom/whoop/design/util/TextResource$b;

.field private static final d:Z

.field private static final e:Lhu2/b;

.field public static final f:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lxu2/a$a;

    invoke-direct {v0}, Lxu2/a$a;-><init>()V

    sput-object v0, Lxu2/a$a;->a:Lxu2/a$a;

    const/4 v0, 0x1

    sput-boolean v0, Lxu2/a$a;->b:Z

    sget v1, Lcu2/h;->Z0:I

    invoke-static {v1}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v1

    sput-object v1, Lxu2/a$a;->c:Lcom/whoop/design/util/TextResource$b;

    sput-boolean v0, Lxu2/a$a;->d:Z

    sget-object v0, Lhu2/b$j;->w:Lhu2/b$j;

    sput-object v0, Lxu2/a$a;->e:Lhu2/b;

    sget v0, Lcom/whoop/design/util/TextResource$b;->c:I

    sput v0, Lxu2/a$a;->f:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    sget-boolean v0, Lxu2/a$a;->b:Z

    return v0
.end method

.method public b()Z
    .locals 1

    sget-boolean v0, Lxu2/a$a;->d:Z

    return v0
.end method

.method public c()Lhu2/b;
    .locals 1

    sget-object v0, Lxu2/a$a;->e:Lhu2/b;

    return-object v0
.end method

.method public d()Lcom/whoop/design/util/TextResource$b;
    .locals 1

    sget-object v0, Lxu2/a$a;->c:Lcom/whoop/design/util/TextResource$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of p1, p1, Lxu2/a$a;

    if-nez p1, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    return v0
.end method

.method public bridge synthetic getText()Lcom/whoop/design/util/TextResource;
    .locals 1

    invoke-virtual {p0}, Lxu2/a$a;->d()Lcom/whoop/design/util/TextResource$b;

    move-result-object v0

    return-object v0
.end method

.method public hashCode()I
    .locals 1

    const v0, -0x1c43bc68

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "LinkWorkout"

    return-object v0
.end method
