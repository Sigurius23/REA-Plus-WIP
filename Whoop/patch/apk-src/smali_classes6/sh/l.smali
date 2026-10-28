.class public final Lsh/l;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lsh/l;


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lsh/l;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Lsh/l;-><init>(ZI)V

    sput-object v0, Lsh/l;->c:Lsh/l;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lsh/l;->a:Z

    iput p2, p0, Lsh/l;->b:I

    return-void
.end method
