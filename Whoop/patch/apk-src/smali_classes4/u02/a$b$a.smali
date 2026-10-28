.class public Lu02/a$b$a;
.super Lu02/a$b;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu02/a$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lu02/a$b$a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lu02/a$b<",
        "TT;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0016\u0018\u0000*\u0006\u0008\u0002\u0010\u0001 \u00012\u0008\u0012\u0004\u0012\u00028\u00020\u0002:\u0001\u0013B+\u0012\n\u0010\u0005\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u001e\u0010\u0005\u001a\u00060\u0003j\u0002`\u00048\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000e\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014R\u001a\u0010\t\u001a\u00020\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0015\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\n8\u0010X\u0090\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u0011\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lu02/a$b$a;",
        "T",
        "Lu02/a$b;",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "exception",
        "",
        "errorMessage",
        "",
        "errorCode",
        "",
        "handled",
        "<init>",
        "(Ljava/lang/Exception;Ljava/lang/String;IZ)V",
        "b",
        "Ljava/lang/Exception;",
        "()Ljava/lang/Exception;",
        "c",
        "Ljava/lang/String;",
        "a",
        "()Ljava/lang/String;",
        "d",
        "I",
        "()I",
        "e",
        "Z",
        "()Z",
        "network_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final b:Ljava/lang/Exception;

.field private final c:Ljava/lang/String;

.field private final d:I

.field private final e:Z


# direct methods
.method public constructor <init>(Ljava/lang/Exception;Ljava/lang/String;IZ)V
    .locals 1

    const-string v0, "exception"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorMessage"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lu02/a$b;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lu02/a$b$a;->b:Ljava/lang/Exception;

    iput-object p2, p0, Lu02/a$b$a;->c:Ljava/lang/String;

    iput p3, p0, Lu02/a$b$a;->d:I

    iput-boolean p4, p0, Lu02/a$b$a;->e:Z

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lu02/a$b$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/Exception;
    .locals 1

    iget-object v0, p0, Lu02/a$b$a;->b:Ljava/lang/Exception;

    return-object v0
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lu02/a$b$a;->e:Z

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lu02/a$b$a;->d:I

    return v0
.end method
