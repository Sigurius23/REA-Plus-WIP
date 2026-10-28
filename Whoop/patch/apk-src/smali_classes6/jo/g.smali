.class public final Ljo/g;
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

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Ldb/k0;-><init>(I)V

    sput-object v0, Ljo/g;->e:Ldb/k0;

    new-instance v0, Ldb/k0;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Ldb/k0;-><init>(I)V

    sput-object v0, Ljo/g;->f:Ldb/k0;

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Ljo/g;->a:I

    iput p2, p0, Ljo/g;->b:I

    iput-object p3, p0, Ljo/g;->c:Ljava/lang/String;

    iput-object p4, p0, Ljo/g;->d:Ljava/lang/String;

    return-void
.end method
