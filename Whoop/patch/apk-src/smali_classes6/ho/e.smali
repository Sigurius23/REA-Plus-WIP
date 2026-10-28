.class public final Lho/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ldb/k0;


# instance fields
.field public final a:Lho/f;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldb/k0;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Ldb/k0;-><init>(I)V

    sput-object v0, Lho/e;->c:Ldb/k0;

    return-void
.end method

.method public constructor <init>(Lho/f;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho/e;->a:Lho/f;

    iput p2, p0, Lho/e;->b:I

    return-void
.end method
