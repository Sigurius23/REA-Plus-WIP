.class public final Lk80/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c7\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u000c\u001a\u00020\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lk80/n;",
        "",
        "<init>",
        "()V",
        "",
        "email",
        "",
        "a",
        "(Ljava/lang/String;)Z",
        "Lyb3/p;",
        "b",
        "Lyb3/p;",
        "EMAIL_BE_PATTERN",
        "activation_release"
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
.field public static final a:Lk80/n;

.field private static final b:Lyb3/p;

.field public static final c:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lk80/n;

    invoke-direct {v0}, Lk80/n;-><init>()V

    sput-object v0, Lk80/n;->a:Lk80/n;

    new-instance v0, Lyb3/p;

    const-string v1, "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"

    invoke-direct {v0, v1}, Lyb3/p;-><init>(Ljava/lang/String;)V

    sput-object v0, Lk80/n;->b:Lyb3/p;

    const/16 v0, 0x8

    sput v0, Lk80/n;->c:I

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Z
    .locals 1

    const-string v0, "email"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lk80/n;->b:Lyb3/p;

    invoke-virtual {v0, p1}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result p1

    return p1
.end method
