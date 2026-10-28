.class public final Landroidx/databinding/p;
.super Landroidx/databinding/c;
.source "SourceFile"


# static fields
.field public static final F:Landroidx/databinding/o;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Landroidx/databinding/o;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Landroidx/databinding/p;->F:Landroidx/databinding/o;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Landroidx/databinding/p;->F:Landroidx/databinding/o;

    invoke-direct {p0, v0}, Landroidx/databinding/c;-><init>(Landroidx/databinding/b;)V

    return-void
.end method
