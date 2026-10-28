.class public final Lg6/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final f:Ljava/lang/ThreadLocal;


# instance fields
.field public final a:La0/f1;

.field public final b:Ljava/util/ArrayList;

.field public final c:Le10/k0;

.field public d:La33/d;

.field public e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Lg6/b;->f:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, La0/f1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, La0/f1;-><init>(I)V

    iput-object v0, p0, Lg6/b;->a:La0/f1;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lg6/b;->b:Ljava/util/ArrayList;

    new-instance v0, Le10/k0;

    const/16 v2, 0x14

    invoke-direct {v0, p0, v2}, Le10/k0;-><init>(Ljava/lang/Object;I)V

    iput-object v0, p0, Lg6/b;->c:Le10/k0;

    iput-boolean v1, p0, Lg6/b;->e:Z

    return-void
.end method
