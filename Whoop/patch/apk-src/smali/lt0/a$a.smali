.class public final Llt0/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llt0/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Llt0/a$a;",
        "",
        "<init>",
        "()V",
        "",
        "value",
        "Llt0/e;",
        "b",
        "(B)Llt0/e;",
        "Llt0/l;",
        "a",
        "(B)Llt0/l;",
        "connectivity-core_release"
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
.field static final synthetic a:Llt0/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llt0/a$a;

    invoke-direct {v0}, Llt0/a$a;-><init>()V

    sput-object v0, Llt0/a$a;->a:Llt0/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(B)Llt0/l;
    .locals 1

    sget-object v0, Llt0/l;->Companion:Llt0/l$a;

    invoke-virtual {v0, p1}, Llt0/l$a;->a(B)Llt0/l;

    move-result-object p1

    return-object p1
.end method

.method public final b(B)Llt0/e;
    .locals 1

    sget-object v0, Llt0/e;->Companion:Llt0/e$a;

    invoke-virtual {v0, p1}, Llt0/e$a;->a(B)Llt0/e;

    move-result-object p1

    return-object p1
.end method
