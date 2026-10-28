.class public final Ldb/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final e:Ldb/k0;

.field public static final f:Ldb/k0;


# instance fields
.field public final a:I

.field public final b:I

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldb/k0;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ldb/k0;-><init>(I)V

    sput-object v0, Ldb/l0;->e:Ldb/k0;

    new-instance v0, Ldb/k0;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Ldb/k0;-><init>(I)V

    sput-object v0, Ldb/l0;->f:Ldb/k0;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ldb/l0;->a:I

    iput p2, p0, Ldb/l0;->b:I

    iput-object p3, p0, Ldb/l0;->c:Ljava/lang/String;

    iput-object p4, p0, Ldb/l0;->d:Ljava/lang/String;

    return-void
.end method
