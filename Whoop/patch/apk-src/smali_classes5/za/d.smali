.class public final Lza/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final c:Lm3/g;


# instance fields
.field public final a:Lza/e;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lm3/g;

    const/16 v1, 0x14

    invoke-direct {v0, v1}, Lm3/g;-><init>(I)V

    sput-object v0, Lza/d;->c:Lm3/g;

    return-void
.end method

.method public constructor <init>(Lza/e;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lza/d;->a:Lza/e;

    iput p2, p0, Lza/d;->b:I

    return-void
.end method
