.class public final Lj92/j$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj92/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lj92/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u0001\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0008\u0005\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\t\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000eR \u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00108\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0015"
    }
    d2 = {
        "Lj92/j$c;",
        "Lj92/j;",
        "<init>",
        "()V",
        "",
        "b",
        "Ljava/lang/String;",
        "getName",
        "()Ljava/lang/String;",
        "name",
        "",
        "c",
        "Ljava/lang/Void;",
        "d",
        "()Ljava/lang/Void;",
        "usingCognito",
        "",
        "Ljava/util/List;",
        "a",
        "()Ljava/util/List;",
        "tags",
        "core_release"
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
.field public static final a:Lj92/j$c;

.field private static final b:Ljava/lang/String;

.field private static final c:Ljava/lang/Void;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lj92/j$c;

    invoke-direct {v0}, Lj92/j$c;-><init>()V

    sput-object v0, Lj92/j$c;->a:Lj92/j$c;

    const-string v0, "whoop.token-refresh.using_old_storage"

    sput-object v0, Lj92/j$c;->b:Ljava/lang/String;

    sget-object v0, Lm83/y;->w:Lm83/y;

    sput-object v0, Lj92/j$c;->d:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    sget-object v0, Lj92/j$c;->d:Ljava/util/List;

    return-object v0
.end method

.method public bridge b()Ljy1/a;
    .locals 1

    invoke-super {p0}, Lj92/j;->b()Ljy1/a;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic c()Ljava/lang/Boolean;
    .locals 1

    invoke-virtual {p0}, Lj92/j$c;->d()Ljava/lang/Void;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    return-object v0
.end method

.method public d()Ljava/lang/Void;
    .locals 1

    sget-object v0, Lj92/j$c;->c:Ljava/lang/Void;

    return-object v0
.end method

.method public getName()Ljava/lang/String;
    .locals 1

    sget-object v0, Lj92/j$c;->b:Ljava/lang/String;

    return-object v0
.end method
