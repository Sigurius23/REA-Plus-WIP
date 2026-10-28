.class public final Lfj/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ljava/lang/Object;

.field public static final d:Ljava/util/LinkedHashMap;


# instance fields
.field public final a:Lzt/q;

.field public final b:Lcom/google/crypto/tink/internal/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lfj/a;->c:Ljava/lang/Object;

    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    sput-object v0, Lfj/a;->d:Ljava/util/LinkedHashMap;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lzt/q;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lzt/q;-><init>(I)V

    iput-object v0, p0, Lfj/a;->a:Lzt/q;

    new-instance v0, Lcom/google/crypto/tink/internal/l0;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lcom/google/crypto/tink/internal/l0;-><init>(I)V

    iput-object v0, p0, Lfj/a;->b:Lcom/google/crypto/tink/internal/l0;

    return-void
.end method
