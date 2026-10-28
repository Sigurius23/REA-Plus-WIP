.class public final Lmp/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lmp/e1;


# instance fields
.field public final a:Lmp/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmp/e1;

    invoke-direct {v0}, Lmp/e1;-><init>()V

    sput-object v0, Lmp/e1;->b:Lmp/e1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmp/g1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lmp/g;

    invoke-direct {v1, v0}, Lmp/g;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lmp/e1;->a:Lmp/g;

    return-void
.end method
