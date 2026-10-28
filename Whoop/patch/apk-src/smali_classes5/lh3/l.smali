.class public final Llh3/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:[Llh3/m;

.field public static final d:Llh3/l;

.field public static final e:Llh3/l;


# instance fields
.field public final a:Z

.field public final b:[Llh3/m;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/4 v0, 0x0

    new-array v1, v0, [Llh3/m;

    sput-object v1, Llh3/l;->c:[Llh3/m;

    new-instance v2, Llh3/l;

    const/4 v3, 0x1

    invoke-direct {v2, v3, v1}, Llh3/l;-><init>(Z[Llh3/m;)V

    sput-object v2, Llh3/l;->d:Llh3/l;

    new-instance v2, Llh3/l;

    invoke-direct {v2, v0, v1}, Llh3/l;-><init>(Z[Llh3/m;)V

    sput-object v2, Llh3/l;->e:Llh3/l;

    return-void
.end method

.method public constructor <init>(Z[Llh3/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llh3/l;->a:Z

    iput-object p2, p0, Llh3/l;->b:[Llh3/m;

    return-void
.end method
