.class public final Log3/c;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:[Ljava/lang/String;

.field public final c:[S

.field public final d:Ljava/util/concurrent/atomic/AtomicReferenceArray;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;[SLjava/util/concurrent/atomic/AtomicReferenceArray;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p4, p0, Log3/c;->d:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    iput-object p1, p0, Log3/c;->a:Ljava/lang/String;

    iput-object p2, p0, Log3/c;->b:[Ljava/lang/String;

    iput-object p3, p0, Log3/c;->c:[S

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Log3/c;->a:Ljava/lang/String;

    return-object v0
.end method
