.class public final Ldh/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Ldh/k;


# instance fields
.field public final a:Z

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ldh/k;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Ldh/k;-><init>(ZI)V

    sput-object v0, Ldh/k;->c:Ldh/k;

    return-void
.end method

.method public constructor <init>(ZI)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Ldh/k;->a:Z

    iput p2, p0, Ldh/k;->b:I

    return-void
.end method
