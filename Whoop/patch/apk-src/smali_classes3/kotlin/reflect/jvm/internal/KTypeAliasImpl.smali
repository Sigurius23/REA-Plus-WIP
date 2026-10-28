.class public final Lkotlin/reflect/jvm/internal/KTypeAliasImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj93/e;
.implements Lob3/l;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlin/reflect/jvm/internal/KTypeAliasImpl;",
        "Lj93/e;",
        "Lob3/l;",
        "Lva3/e;",
        "fqName",
        "<init>",
        "(Lorg/jetbrains/kotlin/name/FqName;)V",
        "Lva3/e;",
        "getFqName",
        "()Lorg/jetbrains/kotlin/name/FqName;",
        "kotlin-reflection"
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
.field private final fqName:Lva3/e;


# direct methods
.method public constructor <init>(Lva3/e;)V
    .locals 1

    const-string v0, "fqName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkotlin/reflect/jvm/internal/KTypeAliasImpl;->fqName:Lva3/e;

    return-void
.end method


# virtual methods
.method public final getFqName()Lva3/e;
    .locals 1

    iget-object v0, p0, Lkotlin/reflect/jvm/internal/KTypeAliasImpl;->fqName:Lva3/e;

    return-object v0
.end method
