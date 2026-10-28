.class public final Lrg/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:Lrg/g;

.field public static final b:Lrg/f;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lrg/g;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lrg/g;->a:Lrg/g;

    new-instance v0, Lrg/f;

    invoke-direct {v0}, Lrg/f;-><init>()V

    sput-object v0, Lrg/g;->b:Lrg/f;

    return-void
.end method
