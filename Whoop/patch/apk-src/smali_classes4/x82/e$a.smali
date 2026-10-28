.class public Lx82/e$a;
.super Landroid/os/Binder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx82/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "Landroid/app/Service;",
        ">",
        "Landroid/os/Binder;"
    }
.end annotation


# instance fields
.field private f:Landroid/app/Service;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TS;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/app/Service;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TS;)V"
        }
    .end annotation

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    iput-object p1, p0, Lx82/e$a;->f:Landroid/app/Service;

    return-void
.end method


# virtual methods
.method public a()Landroid/app/Service;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TS;"
        }
    .end annotation

    iget-object v0, p0, Lx82/e$a;->f:Landroid/app/Service;

    return-object v0
.end method
