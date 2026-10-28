.class public final Lmp/h1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lmp/h1;


# instance fields
.field public final a:Lmp/g;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lmp/h1;

    invoke-direct {v0}, Lmp/h1;-><init>()V

    sput-object v0, Lmp/h1;->b:Lmp/h1;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lmp/j1;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lmp/g;

    invoke-direct {v1, v0}, Lmp/g;-><init>(Ljava/lang/Object;)V

    iput-object v1, p0, Lmp/h1;->a:Lmp/g;

    return-void
.end method
