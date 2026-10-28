.class public final Lkotlin/reflect/jvm/internal/KClassImpl$createSyntheticClass$1$1;
.super Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlin/reflect/jvm/internal/KClassImpl;->createSyntheticClass(Lva3/c;Lw93/e;)Lr93/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0014\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "kotlin/reflect/jvm/internal/KClassImpl$createSyntheticClass$1$1",
        "Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;",
        "",
        "Lr93/w;",
        "computeDeclaredFunctions",
        "()Ljava/util/List;",
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


# direct methods
.method public constructor <init>(Lu93/l;Lkb3/n;)V
    .locals 0

    invoke-direct {p0, p2, p1}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/i;-><init>(Lkb3/n;Lu93/b;)V

    return-void
.end method


# virtual methods
.method public computeDeclaredFunctions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lr93/w;",
            ">;"
        }
    .end annotation

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0
.end method
